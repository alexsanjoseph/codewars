import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SnakesLaddersTest {
  @Test
  public void exampleTests() {
    SnakesLadders game = new SnakesLadders();
    assertEquals("Player 1 is on square 38", game.play(1, 1));
    assertEquals("Player 1 is on square 44", game.play(1, 5));
    assertEquals("Player 2 is on square 31", game.play(6, 2));
    assertEquals("Player 1 is on square 25", game.play(1, 1));
  }

  @Test
  public void victoryTest() {
    SnakesLadders game = new SnakesLadders();
    assertEquals("Player 1 is on square 31", game.play(4, 4));
    assertEquals("Player 1 is on square 41", game.play(4, 6));
    assertEquals("Player 2 is on square 38", game.play(1, 1));
    assertEquals("Player 2 is on square 43", game.play(1, 4));
    assertEquals("Player 1 is on square 67", game.play(5, 5));
    assertEquals("Player 1 is on square 91", game.play(2, 2));
    assertEquals("Player 1 is on square 97", game.play(6, 6));
    assertEquals("Player 1 is on square 97", game.play(2, 4));
    assertEquals("Player 2 is on square 67", game.play(4, 4));
    assertEquals("Player 2 is on square 98", game.play(5, 6));
    assertEquals("Player 1 Wins!", game.play(1, 2));
    assertEquals("Game over!", game.play(1, 2));
  }
}