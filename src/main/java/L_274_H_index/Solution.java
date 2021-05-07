/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_274_H_index;

import java.util.Arrays;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int hIndex(int[] citations) {
        int size = citations.length;
        if (size <= 0) {
            return 0;
        }
        Arrays.sort(citations);
        int count = 0;
        for (int i = size - 1; i >= 0; i--) {
            if (count >= citations[i]) {
                return Math.max(count, citations[i]);
            }
            count++;
        }
        return count;
    }
}
