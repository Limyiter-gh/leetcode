/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_605_Can_Place_Flowers;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        //贪心
        int count = 0, len = flowerbed.length;
        for (int i = 0; i < len; ++i) {
            if (flowerbed[i] == 0 && 
                    (i == 0 || flowerbed[i - 1] == 0) && 
                    (i == len - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                ++count;
            }
            if (count >= n) {
                return true;
            }
        }
        return false;
    }
}
