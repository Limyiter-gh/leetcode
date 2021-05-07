/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_852_Peak_Index_in_a_Mountain_Array;

/**
 *
 * @author limyiter
 */
public class Solution {

    public int peakIndexInMountainArray(int[] A) {
        int index = 0;
        if (A.length > 1) {
            for (int i = 0; i < A.length - 1; i++) {
                if (A[i] < A[i + 1]) {
                    index++;
                } else {
                    break;
                }
            }
        }
        return index;
    }
}
