import java.util.HashMap;
import java.util.stream.Stream;

public class RockPaperScissor {

    final HashMap<String, String> winnerTable = new HashMap<String, String>() {
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

    final String[] fruits = { "r", "p","s"};


    TypeTwo checkInput = (String s) -> {return Stream.of("r", "p", "s").anyMatch(s::equalsIgnoreCase);};
    TypeThree prepareWinner = (String player, String computer) -> {return player+computer;};

    public void startGame(String playersHand){
        System.out.println("(R)ock, (P)aper, (S)cissor");

        String computersHand = fruits[(int)(Math.random()*3)];

        while (!checkInput.typeTwo(playersHand)){
            System.out.println("Wrong input, type again");        }

        winnerTable.get(prepareWinner.typeThree(playersHand,computersHand));
    }

    interface TypeTwo{
        boolean typeTwo(String s);
    }

    interface TypeThree{
        String typeThree(String a, String b);
    }
}
