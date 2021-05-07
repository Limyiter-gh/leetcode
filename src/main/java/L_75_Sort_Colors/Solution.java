/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_75_Sort_Colors;

import java.awt.BorderLayout;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int notRed = 0, notBlue = nums.length - 1;
        while (notRed < nums.length && nums[notRed] == 0) {
            notRed++;
        }
        while (notBlue >= 0 && nums[notBlue] == 2) {
            notBlue--;
        }
        int i = notRed;
        while (i <= notBlue) {
            if (nums[i] == 0) {
                swap(nums, i, notRed);
                notRed++;
                i++;
            } else if (nums[i] == 2) {
                swap(nums, i, notBlue);
                notBlue--;
            } else {
                i++;
            }
        }
    }

    public void swap(int[] nu, int i, int j) {
        int temp = nu[i];
        nu[i] = nu[j];
        nu[j] = temp;
    }
}
