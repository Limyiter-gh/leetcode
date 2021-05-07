/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_905_Sort_Array_By_Parity;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int[] sortArrayByParity(int[] A) {
        int[] B = new int[A.length];
        int f = 0, l = A.length - 1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0)//偶数
            {
                B[f++] = A[i];
            } else {
                B[l--] = A[i];
            }
        }

        for (int i = 0; i < A.length; i++) {
            System.out.print(B[i] + " ");
        }
        return B;
    }
}
