import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class RockPaperScissor {

    static Logger log = Logger.getLogger(RockPaperScissor.class.getName());

    private final HashMap<String, String> winnerTable = new HashMap<String, String>() {
        {
            put("rr", "Tie!");
            put("ss", "Tie!");
            put("pp", "Tie!");
            put("pr", "You win");
            put("rp", "Computer Wins!");
            put("rs", "You win!");
            put("sr", "Computer Wins!");
            put("sp", "You win!");
            put("ps", "Computer Wins!");
        }};

    private final String[] handSigns = { "r", "p","s"};
    private String playersHand;

    TypeOne playedHand = () -> {return new Scanner(System.in).nextLine();};
    TypeTwo checkInput = (String s, String[] handSigns) -> Stream.of(handSigns).anyMatch(s::equalsIgnoreCase);
    TypeThree prepareWinner = (String player, String computer) -> player+computer;

    public void startGame(){
        log.info("Welcome to my simple (R)ock, (P)aper, (S)cissor game.");
        log.info("Chose your Hand please!");
        log.info("Type (r) for rock, (p) for paper or (s) for scissor and press Enter");
        playersHand = playedHand.typeOne();
        while (!checkInput.typeTwo(playersHand,handSigns)){
            log.info("Oops, it seems there went something wrong, please type again!");
            playersHand = playedHand.typeOne();
        }

        String computersHand = handSigns[(int)(Math.random()*3)];
        log.info("The computer played: "+computersHand);
        log.info(winnerTable.get(prepareWinner.typeThree(playersHand,computersHand)));
    }

    interface TypeOne{
        String typeOne();
    }

    interface TypeTwo{
        boolean typeTwo(String s, String[] a);
    }

    interface TypeThree{
        String typeThree(String a, String b);
    }
}
