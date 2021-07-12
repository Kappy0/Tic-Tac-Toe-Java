public class Player {
    private char symbol;
    private int playerNum;

    public Player(char sym, int num) {
      symbol = sym;
      playerNum = num;
    }

    public char getSymbol() {
      return this.symbol;
    }

    public int getPlayerNum() {
      return this.playerNum;
    }
}