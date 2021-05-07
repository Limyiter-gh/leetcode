/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_278_First_Bad_Version;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int firstBadVersion(int n) {
        if (n <= 0) {
            return -1;
        }
        int begin = 1, end = n;
        int medium = 0;
        while (begin + 1 < end) {
            medium = begin + (end - begin) / 2;
            if (isBadVersion(medium)) {
                end = medium;
            } else {
                begin = medium;
            }
        }
        if (isBadVersion(begin)) {
            return begin;
        } else {
            return end;
        }
    }

    private boolean isBadVersion(int i) {//瞎写的
        return true;
    }
}
