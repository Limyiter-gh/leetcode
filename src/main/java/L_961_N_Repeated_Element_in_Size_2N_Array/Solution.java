/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_961_N_Repeated_Element_in_Size_2N_Array;

/**
 *
 * @author Li Mingyang
 */
public class Solution {
    public int repeatedNTimes(int[] A) {
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            max = (max < A[i]) ? A[i] : max;
        }
        int b[] = new int[max+1];
        for (int i = 0; i < A.length; i++) {
            b[A[i]] += 1;
            if (b[A[i]] > 1) {
                return A[i];
            }
        }
        return 0;
    }
}
