/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.problem1_7;

/**
 *
 * @author yfimia
 */
public class Main {

    //Method to print a matriz
    public static void printMatrix(int[][] m) {
        for (int f = 0; f < m.length; f++) {
            for (int c = 0; c < m[f].length; c++) {
                System.out.print(m[f][c] + " ");
            }
            System.out.println("");

        }
        System.out.println("----------------------------");
    }

    //Version 1: creating a new matriz - O(n x m)
    //This method works for nxm matrixs and not only for nxn
    public static int[][] rotateMatrix(int[][] img) {
        int nOriginalRows = img != null ? img.length : 0;
        int nOriginalCols = img[0] != null ? img[0].length : 0;

        int nRows = nOriginalCols;
        int nCols = nOriginalRows;
        int[][] out = new int[nRows][nCols];

        for (int f = 0; f < img.length; f++) {
            for (int c = 0; c < img[f].length; c++) {
                out[c][nOriginalCols - 1 - f] = img[f][c];
            }
        }
        return out;
    }

    //Version 1: creating a new matriz - O(n^2)
    // Only for nxn matrix
    public static void rotateMatrix2(int[][] img) {
        int nRows = img != null ? img.length : 0;
        int nCols = img[0] != null ? img[0].length : 0;
        int leftTop, rightTop, leftBottom, rightBottom;
        for (int layer = 0; layer < img.length / 2; layer++) {
            for (int c = layer; c < nCols - 1 - layer; c++) {
                leftTop = img[layer][c];
                rightTop = img[c][nCols - 1 - layer];
                rightBottom = img[nRows - 1 - layer][nCols - 1 - c];
                leftBottom = img[nRows - 1 - c][layer];
                
                img[layer][c] = leftBottom;
                img[c][nCols - 1 - layer] = leftTop;
                img[nRows - 1 - layer][nCols - 1 - c] = rightTop;
                img[nRows - 1 - c][layer] = rightBottom;
                
                //printMatrix(img);
            }
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] mat1 = {
            { 1}
        };

        
        int[][] mat2 = {
            { 1, 2},
            { 3, 4}
        };

        int[][] mat3 = {
            { 1, 2, 3},
            { 4, 5, 6},
            { 7, 8, 9}
        };

        int[][] mat4 = {
            { 1,   2,  3,  4},
            { 5,   6,  7,  8},
            { 9,  10, 11, 12},
            { 13, 14, 15, 16}
        };

        int[][] mat5 = {
            { 1,  2,  3,  4,  5},
            { 6,  7,  8,  9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };

        int[][] mat6 = {
            { 1,  2,  3,  4,  5,  6},
            { 7,  8,  9, 10, 11, 12},
            {13, 14, 15, 16, 17, 18},
            {19, 20, 21, 22, 23, 24},
            {25, 26, 27, 28, 29, 30},
            {31, 32, 33, 34, 35, 36}
        };
        //int[][] r = rotateMatrix(mat);
        rotateMatrix2(mat1);
        printMatrix(mat1);
        rotateMatrix2(mat2);
        printMatrix(mat2);
        rotateMatrix2(mat3);
        printMatrix(mat3);
        rotateMatrix2(mat4);
        printMatrix(mat4);
        rotateMatrix2(mat5);
        printMatrix(mat5);
        rotateMatrix2(mat6);
        printMatrix(mat6);
        
    }

}
