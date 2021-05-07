/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_566_Reshape_the_Matrix;

import java.util.Arrays;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        // 先算出这个数组的行和列
        int nums_r = nums.length;
        int nums_c = nums[0].length;
        //相乘相等则往下走，否则返回原函数
        if (nums_c * nums_r == r * c) {
            int[][] ret = new int[r][c];
            int[] temp = new int[r * c];
            //先把二维数组转换成一维数组
            for (int i = 0; i < nums_r; i++) {
                System.out.println("i = " + i);
                for (int j = 0; j < nums_c; j++) {
                    temp[i * nums_c + j] = nums[i][j];
                }
            }
            //然后再把以为数组重新放入新的二维数组中
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    ret[i][j] = temp[i * c + j];
                }
            }
            return ret;
        } else {
            return nums;
        }
    }
}
