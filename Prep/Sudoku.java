package Prep;

public class Sudoku {

    private static final int GRID_SIZE=9;
    public static void main(String[] args) {
        int[][] board= {  
        {7, 0, 0, 0, 0, 0, 2, 0, 0},   
        {4, 0, 2, 0, 0, 0, 0, 0, 3},   
        {0, 0, 0, 2, 0, 1, 0, 0, 0},   
        {3, 0, 0, 1, 8, 0, 0, 9, 7},   
        {0, 0, 9, 0, 7, 0, 6, 0, 0},   
        {6, 5, 0, 0, 3, 2, 0, 0, 1},   
        {0, 0, 0, 4, 0, 9, 0, 0, 0},   
        {5, 0, 0, 0, 0, 0, 1, 0, 6},   
        {0, 0, 6, 0, 0, 0, 0, 0, 8}   
    };
    solveIt(board);
    for (int[] is : board) {
        for (int is2 : is) {
            System.out.print(is2+" ");
        }
        System.out.println();
    }
    }
    public static boolean isNumberInRow (int[][] board,int number,int row) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if(board[row][i]==number) return true;
        }
        return false;
    }
    public static boolean isNumberInColumn (int[][] board,int number,int column) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if(board[i][column]==number) return true;
        }
        return false;
    }
    public static boolean isNumberInGrid (int[][] board,int number,int row,int column) {
        int local_Row=row-row%3;
        int local_Column=column-column%3;
        for (int i = local_Row; i < local_Row+3; i++) {
           for (int j = local_Column; j < local_Column+3; j++) {
              if(board[i][j]==number) return true; 
           }
        }
        return false;
    }
    public static boolean isValid (int[][] board,int number,int row,int column) {
        return !isNumberInRow(board, number, row) && !isNumberInColumn(board, number, column) && !isNumberInGrid(board, number, row, column);
    }
    public static boolean solveIt(int[][] board) {
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int column = 0; column < GRID_SIZE; column++) {
                if(board[row][column]==0){
                    for (int numToTry = 1; numToTry<= GRID_SIZE; numToTry++) {
                        if (isValid(board,numToTry,row,column)) {
                            board[row][column]=numToTry;
                            if(solveIt(board)) return true;
                            else board[row][column]=0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
}
