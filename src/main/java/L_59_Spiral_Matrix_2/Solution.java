/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_59_Spiral_Matrix_2;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int[][] generateMatrix(int n) {
        int[][] answer = new int[n][n];
        if (n < 1) {
            return answer;
        }
        if (n == 1) {
            answer[0][0] = 1;
        }
        int k = 1;
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        while (left < right && top < bottom) {
            for (int j = left; j < right; j++) {
                answer[top][j] = k++;
            }
            for (int i = top; i < bottom; i++) {
                answer[i][right] = k++;
            }
            for (int j = right; j > left; j--) {
                answer[bottom][j] = k++;
            }
            for (int i = bottom; i > top; i--) {
                answer[i][left] = k++;
            }
            left++;
            right--;
            top++;
            bottom--;
            if (n % 2 != 0) {
                answer[n / 2][n / 2] = k;
            }
        }
        return answer;
    }
}
