/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_88_Merge_Sorted_Array;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pointerA = m - 1;
        int pointerB = n - 1;
        int p = m + n - 1;
        while (pointerA >= 0 && pointerB >= 0) {
            if (nums1[pointerA] > nums2[pointerB]) {
                nums1[p] = nums1[pointerA];
                pointerA--;
            } else {
                nums1[p] = nums2[pointerB];
                pointerB--;
            }
            p--;
        }
        while (pointerA >= 0) {
            nums1[p] = nums1[pointerA];
            pointerA--;
            p--;
        }
        while (pointerB >= 0) {
            nums1[p] = nums2[pointerB];
            pointerB--;
            p--;
        }
    }
}
