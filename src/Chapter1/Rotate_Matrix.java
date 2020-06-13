package Chapter1;

public class Rotate_Matrix {
    public static void main(String[] args) {





    }

    public void rotate(int[][] matrix){
        int n = matrix.length;

        if(n == 0 || matrix.length != matrix[0].length){
            System.out.println("Not valid matrix");
            return;
        }

        for(int i = 0; i < n/2; i++){

            for(int j = i; j < (n - i - 1) ; j++){

                //Save the top
                int temp = matrix[i][j];

                //Move left to top
                matrix[i][j] = matrix[n - 1 - j][i];

                //Move bottom to left
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];

                //Move right to bottom
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];

                //Move temp variable (top) to right
                matrix[j][n - 1 - i] = temp;

            }
        }


    }









}
