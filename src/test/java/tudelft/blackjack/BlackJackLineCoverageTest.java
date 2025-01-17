package tudelft.blackjack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BlackJackLineCoverageTest {

    @Test
    public void bothPlayersGoTooHigh() {
        int result = new BlackJack().play(30, 30);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void leftPlayerWins() {
        int result = new BlackJack().play(10, 9);
        Assertions.assertEquals(10, result);
    }
    @Test
    public void rightPlayerWins() {
        int result = new BlackJack().play(9, 10);
        Assertions.assertEquals(10, result);
    }
    @Test
    public void drawLessThan21() {
        int result = new BlackJack().play(10, 10);
        Assertions.assertEquals(10, result);
    }
    @Test
    public void leftMoreThan21() {
        int result = new BlackJack().play(30, 9);
        Assertions.assertEquals(9, result);
    }
    @Test
    public void rightMoreThan21() {
        int result = new BlackJack().play(10, 30);
        Assertions.assertEquals(10, result);
    }
}
