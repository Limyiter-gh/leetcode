/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_598_Range_Addition_II;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int maxCount(int m, int n, int[][] ops) {
        if (ops == null || ops.length == 0) {
            return m * n;
        }

        int row = Integer.MAX_VALUE;
        int col = Integer.MAX_VALUE;
        for (int[] op : ops) {
            // op[0]是横坐标  
            row = Math.min(row, op[0]);
            // op[1]是纵坐标  
            col = Math.min(col, op[1]);
        }
        // row * col是左上角的元素个数  
        return row * col;
    }
}
