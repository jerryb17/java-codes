import java.util.*;
public class nQueen {
    public static boolean queenpos(char board [][], int row){
        //base case
        if (row == board.length){
            //printfunction(board);
            //count++;
            return true;
        }
        //column loop

        for (int j=0; j<board.length;j++){
            if (issafetoplace(board, row, j)){
                board[row][j]='Q';
                if(queenpos(board, row+1)){
                    return true;
                }; // function call
                board[row][j]='x';//backtrack
            }
        }
        return false;
    }
    public static void printfunction(char board[][]){
        System.out.println("-----------------------------");
        for (int i=0; i<board.length; i++){
            for (int j=0; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean issafetoplace(char board[][], int row, int col){
        //verticle up ^
        for (int i=row-1; i>=0; i--){
            if (board[i][col]=='Q'){
                return false;
            }
        }
        //diagonal left <--
        for (int i= row-1, j=col-1; i>=0 && j>=0; i--,j--){
            if (board[i][j]=='Q'){
                return false;
            }
        }
        //diagonal right-->
        for (int i= row-1, j= col+1; i>=0 && j<board.length; i--, j++){
            if (board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    //static int count;
    public static void main(String[] args){
        int n = 4;
        char board[][]= new char[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                board[i][j]='x';
            }
        }
        if(queenpos(board, 0)){
            System.out.println("Solution is possible");
            printfunction(board);
        };
        //System.out.print(" total Nqueen Solution = "+ count);


    }
}
