/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_977_Squares_of_a_Sorted_Array;
/**
 *
 * @author Li Mingyang
 */
public class Solution {
    public int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = Math.abs(A[i]) * Math.abs(A[i]);
        }
        int temp = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 1; j < A.length; j++) {
                if (A[i] > A[j]) {
                    temp = A[i];
                    A[j] = A[i];
                    A[i] = temp;
                }
            }
        }
        return A;
    }
}
