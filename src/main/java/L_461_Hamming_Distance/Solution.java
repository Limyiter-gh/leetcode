/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_461_Hamming_Distance;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        int res = 0;
        while (z != 0) {
            if (z % 2 == 1) {
                res++;
            }
            z = z / 2;
        }
        return res;
    }
}
