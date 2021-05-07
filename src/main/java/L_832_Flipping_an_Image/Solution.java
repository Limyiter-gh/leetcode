/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_832_Flipping_an_Image;

/**
 *
 * @author limyiter
 */
public class Solution {

    public int[][] flipAndInvertImage(int[][] A) {
        int tmp = 0;
        for (int[] A1 : A) {
            //先做翻转
            for (int i = 0; i < A1.length / 2; i++) {
                tmp = A1[i];
                A1[i] = A1[A1.length - 1 - i];
                A1[A1.length - 1 - i] = tmp;
            }
            //在做替换
            for (int i = 0; i < A1.length; i++) {
                if (A1[i] == 0) {
                    A1[i] = 1;
                } else {
                    A1[i] = 0;
                }
            }
        }
        return A;
    }
}
