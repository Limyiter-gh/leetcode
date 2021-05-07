/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_167_Two_Sum_II_Input_array_is_sorted;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int[] twoSum(int[] numbers, int target) {
        //两头pointer 向中间移动
        if (numbers == null || numbers.length < 1) {
            return null;
        }
        int i = 0, j = numbers.length - 1;

        while (i < j) {
            int x = numbers[i] + numbers[j];
            if (x < target) {
                ++i;
            } else if (x > target) {
                --j;
            } else {
                return new int[]{i + 1, j + 1};
            }
        }
        return null;
    }
}
