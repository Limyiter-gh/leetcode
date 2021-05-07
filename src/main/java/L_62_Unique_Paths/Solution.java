/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_62_Unique_Paths;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int uniquePaths(int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        if (m == 1 || n == 1) {
            return 1;
        }
        int[][] answer = new int[m][n];
        for (int i = 0; i < n; i++) {
            answer[0][i] = 1;
        }
        for (int i = 0; i < m; i++) {
            answer[i][0] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                answer[i][j] = answer[i - 1][j] + answer[i][j - 1];
            }
        }
        return answer[m - 1][n - 1];
    }
}
