/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_190_Reverse_Bits;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int reverseBits(int n) {
        int INT_SIZE = Integer.SIZE;
        for (int i = 0; i < INT_SIZE / 2; i++) {
            int j = INT_SIZE - 1 - i;

            int low = (n >> i) & 1;
            int high = (n >> j) & 1;

            int A = 1 << i;
            int B = 1 << j;

            if ((high ^ low) == 1) {
                n = n ^ (A | B);
            }
        }
        return n;
    }
}
