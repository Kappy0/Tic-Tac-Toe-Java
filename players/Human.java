public class Human extends Player {
  public Human(char symbol, int playerNum) {
    super(symbol, playerNum);
  }

  public void takeTurn(char[][] gameBoard) {
    System.out.println("Taking human turn...");
  }
}