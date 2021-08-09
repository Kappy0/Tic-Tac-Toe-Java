class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    //initialize any global variables needed for the game

    //initialize players
    

    //initialize game board
    char [][] gameBoard = GameUtils.createGameBoard();
    String finalGameBoard = GameUtils.drawGameBoard(gameBoard);

    System.out.println(finalGameBoard);

    //play game
  }
}