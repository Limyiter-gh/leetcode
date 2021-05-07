/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_883_Projection_Area_of_3D_Shapes;

/**
 *
 * @author limyiter
 */
public class Solution {

    public int projectionArea(int[][] grid) {
        int a = 0;
        int b = 0;
        int c = 0;
        //底面，还要删去0的数量
        for (int[] is : grid) {
            a += is.length;
        }
        int zerosize = 0;
        for (int[] is : grid) {
            for (int i : is) {
                if (i == 0) {
                    zerosize++;
                }
            }
        }
        a = a - zerosize;
        //侧面，每个数组中最高的
        int[] topb = new int[grid.length];
        for (int i = 0; i < grid.length; i++) {
            topb[i] = grid[i][0];
            for (int j = 1; j < grid[i].length; j++) {
                if (topb[i] < grid[i][j]) {
                    topb[i] = grid[i][j];
                }
            }
        }
        for (int i : topb) {
            b += i;
        }
        //侧面，所有数组中对应列最高的
        int length = 0;
        for (int[] is : grid) {
            if (length < is.length) {
                length = is.length;
            }
        }
        int[] topc = new int[length];
        for (int i = 0; i < length; i++) {
            for (int[] grid1 : grid) {
                if (grid1.length >= i + 1) {
                    if (topc[i] < grid1[i]) {
                        topc[i] = grid1[i];
                    }
                }
            }
        }
        for (int i : topc) {
            c += i;
        }
        return a + b + c;
    }
}
