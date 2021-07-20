public class GameUtils {
  public static char[][] createGameBoard() {
    char[][] board = new char[3][3];

    int boardLength = board.length;

    for(int i = 0; i < Math.pow(boardLength, 2); i++)
    {
      int row = i / boardLength;
      int col = i % boardLength;

      board[row][col] = '-';
    }

    return board;
  }
}