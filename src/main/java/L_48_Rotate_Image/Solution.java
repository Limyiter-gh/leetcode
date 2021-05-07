/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_48_Rotate_Image;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public void rotate(int[][] matrix) {
        if (matrix == null) {
            return;
        }
        if (matrix.length != matrix[0].length) {
            return;
        }
        int m = matrix.length;
        int[][] answer = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                answer[j][m - 1 - i] = matrix[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = answer[i][j];
            }
        }
    }
}
