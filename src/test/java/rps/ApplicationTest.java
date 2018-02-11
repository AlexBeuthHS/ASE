package rps;

import org.junit.Test;

import java.io.ByteArrayInputStream;

public class ApplicationTest {

    @Test
    public void playGame() {
        ByteArrayInputStream in = new ByteArrayInputStream("p".getBytes());
        System.setIn(in);
        Application application = new Application();
        String[] a = new String[0];
        application.main(a);
    }

}