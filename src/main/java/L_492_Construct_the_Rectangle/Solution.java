/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_492_Construct_the_Rectangle;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int[] constructRectangle(int area) {
        if (area == 0) {
            return new int[]{0, 0};
        }
        int w = (int) Math.sqrt(area);
        while (area % w != 0) {
            w--;
        }
        return new int[]{area / w, w};
    }
}
