package rps;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;

public class RockPaperScissorTest {

    private final String[] handSigns = { "r", "p","s"};

        @Test
        public void invalidInput() {
            RockPaperScissor game = new RockPaperScissor();
            Assert.assertFalse(game.checkInput.typeTwo("x",handSigns));
            Assert.assertFalse(game.checkInput.typeTwo("y",handSigns));
            Assert.assertFalse(game.checkInput.typeTwo("1",handSigns));
        }
        @Test
        public void validInput() {
            RockPaperScissor game = new RockPaperScissor();
            Assert.assertTrue(game.checkInput.typeTwo("r",handSigns));
            Assert.assertTrue(game.checkInput.typeTwo("p",handSigns));
            Assert.assertTrue(game.checkInput.typeTwo("s",handSigns));
        }

        @Test
        public void prepareWinner() {
            RockPaperScissor game = new RockPaperScissor();
            Assert.assertEquals("rs",game.prepareWinner.typeThree("r","s"));
        }

        @Test
            public void game(){
            ByteArrayInputStream in = new ByteArrayInputStream("r".getBytes());
            System.setIn(in);
            RockPaperScissor game = new RockPaperScissor();
            game.startGame();
        }

}