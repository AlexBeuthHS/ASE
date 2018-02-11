import java.util.Scanner;

public class Application {



    public static void main(String args) {

        TypeOne playersHand = () -> {return new Scanner(System.in).nextLine();};

        RockPaperScissor game = new RockPaperScissor();
        game.startGame(playersHand.typeOne());
    }

    interface TypeOne{
        String typeOne();
    }


}
