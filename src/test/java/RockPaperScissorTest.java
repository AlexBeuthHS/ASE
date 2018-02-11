import org.junit.Assert;
import org.junit.Test;

public class RockPaperScissorTest {


        @Test
        public void invalidInput() {
            RockPaperScissor game = new RockPaperScissor();
            Assert.assertFalse(game.checkInput.typeTwo("x"));
            Assert.assertFalse(game.checkInput.typeTwo("y"));
            Assert.assertFalse(game.checkInput.typeTwo("1"));
        }
        @Test
        public void validInput() {
            RockPaperScissor game = new RockPaperScissor();
            Assert.assertTrue(game.checkInput.typeTwo("r"));
            Assert.assertTrue(game.checkInput.typeTwo("p"));
            Assert.assertTrue(game.checkInput.typeTwo("s"));
        }

        @Test
        public void prepareWinner() {
            RockPaperScissor game = new RockPaperScissor();
            Assert.assertEquals(game.prepareWinner.typeThree("r","s"),"rs");
        }


}