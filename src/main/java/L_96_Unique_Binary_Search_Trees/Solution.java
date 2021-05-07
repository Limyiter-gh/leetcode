/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_96_Unique_Binary_Search_Trees;

/**
 * 要用到卡特兰数
 *
 * @author Li Mingyang
 */
public class Solution {

    public int numTrees(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int[] C = new int[n+1];
        C[0] = 1;

        for (int num = 1; num <= n; num++) {
            for (int i = 0; i <= num - 1; i++) {
                C[num] += C[i] * C[(num - 1) - i];
            }
        }
        return C[n];
    }
}
