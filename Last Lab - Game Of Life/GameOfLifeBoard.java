//Robert C Plata III
public class GameOfLifeBoard{
	
  static boolean go = true;
  private static int BOARDSIZE = 9;
  private char[][] board;
  private char[][] nextBoard;
  public static final char LIVE = 'x';
  public static final char DEAD = '-';
  
  //Create blank(dead) board and board with starting glider
  public GameOfLifeBoard(int size) {
    board = new char[size][size];
    nextBoard = new char[size][size];
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        nextBoard[i][j] = 45;
        if (((i == 0) && (j == 1)) || ((i == 1) && (j == 2)) || ((i == 2) && (j < 3))) { //glider paremeters
          board[i][j] = LIVE;
        }
        else {
          board[i][j] = DEAD;
        }
      }
    }
  }
  
  public void generateNextStep() {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        int neighbors = getNeighborCount(i, j); // Resets to 0 every loop
       
        // Requirements to be alive or dead
        if (board[i][j] == LIVE) {
          if (neighbors == 2) {
            nextBoard[i][j] = LIVE;
          }
          else if (neighbors == 3) {
            nextBoard[i][j] = LIVE;
          }
          else if ((neighbors > 3) || (neighbors < 2)) {
            nextBoard[i][j] = DEAD;
          }
        }
        if (board[i][j] == DEAD) {
          if (neighbors > 3) {
            nextBoard[i][j] = DEAD;
          }
          else if (neighbors < 2) {
            nextBoard[i][j] = DEAD;
          }
          else if (neighbors == 3) {
            nextBoard[i][j] = LIVE;
          }
        }
      }
    }
    board = nextBoard; // Assign board to the next step
  }
  
  // Neighbor count for generation of next step
  public int getNeighborCount(int row, int col){
    int numNeighbors = 0;
    for (int i = row - 1; i <= row + 1; i++){ // Insuring out of bounds wont occur
      if ((i >= 0) && (i < board.length)){ // only if row is greater than or equal to zero
        for (int j = col - 1; j <= col + 1; j++) { // Same for column
          if ((j >= 0) && (j < board[i].length) && ((i != row) || (j != col)) && (board[i][j] == 'x')) { // 8 around, not itself
            numNeighbors++;
          }
        }
      }
    }
    return numNeighbors;
  }
  
  public void printBoard(char[][] brd) // Simple Print
  {
    for (int i = 0; i < brd.length; i++) {
      for (int j = 0; j < brd.length; j++) {
        System.out.print(brd[i][j]);
        if (j < brd[i].length - 1) {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
  
  public static void main(String[] args){
	  
    java.util.Scanner kb = new java.util.Scanner(System.in);
    GameOfLifeBoard glider = new GameOfLifeBoard(BOARDSIZE); // Initiating constructor
    
    while (go){ // Boolean go
    	
      System.out.println("Board");
      glider.printBoard(glider.board);
      glider.generateNextStep();
      glider.nextBoard = new char[BOARDSIZE][BOARDSIZE];
      for (int i = 0; i < glider.nextBoard.length; i++) {
        for (int j = 0; j < glider.nextBoard.length; j++) {
          glider.nextBoard[i][j] = DEAD;
        }
      }
      System.out.println("quit?");
      String userInput = kb.next();
      if (userInput.equals("quit")) {
        go = false;
      }
    }
  }
}