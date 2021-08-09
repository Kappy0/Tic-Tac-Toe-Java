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

  public static String drawGameBoard(char[][] gameBoard) {
    int boardLength = gameBoard.length;
    StringBuilder drawnBoard = new StringBuilder();

    for(int i = 0; i < Math.pow(boardLength, 2); i++)
    {
      int row = i / boardLength;
      int column = i % boardLength;
  
      if(i == 2 || i == 5 || i == 8)
      {
        drawnBoard.append(gameBoard[row][column]);
    
        if(i != 8)
        {
          drawnBoard.append("\n");
          drawnBoard.append("---------");
          drawnBoard.append("\n");
        }
      }
      else
      {
        drawnBoard.append(gameBoard[row][column]);
        drawnBoard.append(" | ");
      }
    }

    String finalBoard = drawnBoard.toString();
    return finalBoard;
  }
}