/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.problem1_8;

/**
 *
 * @author yfimia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] mat = {
            {0, 1, 1, 1},
            {2, 2, 2, 2},
            {3, 3, 3, 3},
            {4, 4, 4, 0}
        };

        processMatrix(mat);

        printMatrix(mat);

    }

    private static void printMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("-----------------------------");
    }

    private static void processMatrix(int[][] mat) {
        boolean[] zeroCol = new boolean[mat.length];
        for (int i = 0; i < mat.length; i++) {
            int zeroRow = 1;
            for (int j = 0; j < mat[i].length; j++) {
                if ((mat[i][j] == 0) && (zeroRow == 1)) {
                    //Mark zeroRow to clear further element in the row
                    zeroRow = 0;
                    //Clear previos elements in the row
                    for (int c = j; c >= 0; c--) {
                        mat[i][c] = 0;
                    }
                    //If the column have not been marked to be zero clear previos elements in the column
                    if (!zeroCol[j]) {
                        for (int f = i - 1; f >= 0; f--) {
                            mat[f][j] = 0;
                        }
                        //Mark the column to be zero to clear further elements in this column
                        zeroCol[j] = true;
                    }
                    
                }
                //If the row or the column have been marked to be zero the elements will be set to 0
                mat[i][j] = zeroRow * (zeroCol[j] ? 0 : 1) * mat[i][j];
            }
        }
    }

    
    
}
