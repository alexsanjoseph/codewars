import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;

public class SnakesLadders {

  private final Map<Integer, Integer> connections = Map.ofEntries(
    entry(2, 38),
    entry(7, 14),
    entry(8, 31),
    entry(15, 26),
    entry(21, 42),
    entry(28, 84),
    entry(36, 44),
    entry(51, 67),
    entry(71, 91),
    entry(78, 98),
    entry(87, 94),
    entry(16, 6),
    entry(46, 25),
    entry(49, 11),
    entry(62, 19),
    entry(64, 60),
    entry(74, 53),
    entry(89, 68),
    entry(92, 88),
    entry(95, 75),
    entry(99, 80)
  );
  private HashMap<Integer, Integer> playerPositions;
  private int currentPlayer;
  private boolean isGameWon;

  public SnakesLadders() {
    playerPositions =  new HashMap<>(Map.of(
      1, 0,
      2, 0
    ));
    currentPlayer = 1;
    isGameWon = false;
  }


  public String play(int die1, int die2) {

    if (isGameWon) return "Game over!";

    updatePosition(die1 + die2, playerPositions.get(currentPlayer));
    updateVictoryCondition();
    String output = getOutputString();
    updatePlayerTurn(die1, die2);
    return output;
  }


  private boolean isDoublePlay(int die1, int die2) {
    return die1 == die2;
  }

  private void updatePosition(int dieTotal, int currentPosition) {
    int newPosition = currentPosition + dieTotal;
    if (newPosition > 100) newPosition = 200 - (newPosition);
    newPosition = updateForSnakesAndLadders(newPosition);
    playerPositions.put(currentPlayer, newPosition);
  }

  private int updateForSnakesAndLadders(int newPosition) {
    if (connections.containsKey(newPosition)) {
      newPosition = connections.get(newPosition);
    }
    return newPosition;
  }

  private static int nextPlayer(int currentPlayer) {
    return (currentPlayer % 2) + 1;
  }

  private void updateVictoryCondition() {
    if (playerPositions.get(currentPlayer) == 100) {
      isGameWon = true;
    }
  }

  private void updatePlayerTurn(int die1, int die2) {
    if (!isDoublePlay(die1, die2)) currentPlayer = nextPlayer(currentPlayer);
  }

  private String getOutputString() {
    return isGameWon ?
      String.format("Player %s Wins!", currentPlayer) :
      String.format("Player %s is on square %s",
        currentPlayer, playerPositions.get(currentPlayer));
  }
}