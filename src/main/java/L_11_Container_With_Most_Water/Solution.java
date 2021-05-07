/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_11_Container_With_Most_Water;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int maxArea(int[] height) {
        if (height == null || height.length == 0) {
            return -1;
        }
        int low = 0, high = height.length - 1;
        int max = 0;
        while (low < high) {
            int area = (high - low) * Math.min(height[low], height[high]);
            max = Math.max(area, max);
            if (height[low] < height[high]) {
                low++;
            } else {
                high--;
            }
        }
        return max;
    }
}
