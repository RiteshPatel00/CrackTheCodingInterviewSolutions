package Chapter1;

import javax.swing.text.StyleContext;

public class Zero_Matrix {
    public static void main(String[] args) {

    }


    void setZeros(int[][] matrix){

        boolean rowHasZero = false;
        boolean colHasZero = false;

        //Check to see if first row and first col have zero
        for(int i = 0; i < matrix.length; i++){
            if (matrix[i][0] == 0){
                rowHasZero = true;
                break;
            }
        }

        for(int j = 0; j < matrix[0].length; j++){
            if (matrix[j][0] == 0){
                colHasZero = true;
                break;
            }
        }

        //Setting zero flags
        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        //Make columns zero based on first row's zero flags
        for(int j = 0; j < matrix[0].length; j++){
            if(matrix[0][j] == 0){
                zero_columns(matrix, j);
            }
        }

        //Make rows zero based on first columns's zero flags
        for(int i = 0; i < matrix.length; i++){
            if(matrix[i][0] == 0){
                zero_rows(matrix, i);
            }
        }

        if(rowHasZero){
            zero_columns(matrix, 0);
        }

        if(colHasZero){
            zero_rows(matrix, 0);
        }




    }

    void zero_rows(int[][] matrix, int row){
        for(int j = 0; j < matrix[0].length; j++ ){
            matrix[row][j] = 0;
        }
    }


    void zero_columns(int[][] matrix, int col){
        for(int i = 0; i < matrix[0].length; i++ ){
            matrix[i][col] = 0;
        }
    }
}


