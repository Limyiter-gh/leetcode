/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_275_H_index_2;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int hIndex(int[] citations) {
        int l = citations.length;
        int start = 0, end = l - 1;
        while (start <= end) {
            int mid = (start + end) >> 1;
            if (citations[mid] == l - mid) {
                return l - mid;
            } else if (citations[mid] > l - mid) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return l - start;
    }
}
