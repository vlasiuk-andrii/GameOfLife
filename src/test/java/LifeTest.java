import org.junit.Test;

import static org.junit.Assert.*;


public class LifeTest {
    Life life = new Life();

    @Test
    public void myTest(){
        assertEquals("" +
                "........\n" +
                "...**...\n" +
                "...**...\n" +
                "........",
                life.nextGeneration("" +
                "........\n" +
                "....**..\n" +
                "...**...\n" +
                "........"));
    }

}