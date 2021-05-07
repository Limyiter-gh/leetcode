/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_73_Set_Matrix_Zeroes;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        if (m == 0 || n == 0) {
            return;
        }
        int[] flagr = new int[m];
        int[] flagc = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    flagr[i] = 1;
                    flagc[j] = 1;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (flagr[i] == 1 || flagc[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
