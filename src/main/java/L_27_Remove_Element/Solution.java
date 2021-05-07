/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_27_Remove_Element;

/**
 *
 * @author Li Mingyang
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        int aflen = 0;
        for (int i = 0; i < nums.length; i++) {
            if (val != nums[i]) {
                nums[aflen++] = nums[i];
            }
        }
        return aflen;
    }
}
