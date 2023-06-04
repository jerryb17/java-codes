import java.util.*;
public class array2d {
    public static boolean findkey(int matrix[][], int key){
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                if (matrix[i][j]==key){

                    System.out.print("key found at"+ "("+ i + ","+ j+")");
                    return true;
                }

            }


        }
        System.out.print("key not found");
        return false;
    }
    public static void spiralMatrix(int matrix1 [][]){
        int Srow = 0;
        int Scol = 0;
        int Erow = matrix1.length-1;
        int Ecol = matrix1[0].length-1;
        while (Srow <= Erow && Scol <= Ecol){
            //top
            for (int j= Scol; j<=Ecol; j++){
                System.out.print(matrix1[Srow][j]+ " ");
            }
            //right
            for (int i = Srow+1; i<=Erow; i++){
                System.out.print(matrix1[i][Ecol]+ " ");
            }
            //bottom
            for (int j = Ecol-1; j>=Scol; j--){
                if (Srow==Erow){
                    break;
                }
                System.out.print(matrix1[Erow][j]+" ");
            }
            //left
            for (int i = Erow-1; i>=Srow+1; i--){
                if (Scol==Ecol){
                    break;
                }
                System.out.print(matrix1[i][Scol]+" ");
            }
            Srow++;
            Scol++;
            Erow--;
            Ecol--;
        }
        System.out.println();

    }
    public static int diagonalSum(int matrix [] []){
        int sum = 0;
        for (int i=0; i< matrix.length; i++){
            sum += matrix[i][i];

            if (i != matrix.length-1-i){
                sum+= matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }
    public static boolean searchKey(int matrix[][], int key){
        int row = 0, col = matrix[0].length-1;
        while (row < matrix.length && col>=0) {
            if (key == matrix[row][col]) {
                System.out.print("found key at: " + "(" + row + "," + col + ") ");
                return true;
            } else if (key > matrix[row][col]) {

                row++;

            }
            else {
                col--;
            }
        }

        System.out.print("Key not found ");
        return false;

    }
    public static void main(String[] args){

        int matrix [][]= {{10, 20, 30, 40},
                {15, 25, 35, 45},
        {27, 29, 37, 48,},
        {32, 33, 39, 50}};
        int key=13;
        System.out.print(searchKey(matrix, key));


        /*int matrix[][] = new int[4][4];
        int n = matrix.length, m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
//input
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        //output
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                System.out.print(matrix[i][j]+ ","+" ");
            }
            System.out.println();
        }
        findkey(matrix, 9);
        */

    }
}
