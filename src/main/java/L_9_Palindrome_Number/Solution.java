/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_9_Palindrome_Number;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public boolean isPalindrome(int x) {
        int xx = x;
        int reverseX = 0;
        while (xx > 0) {
            reverseX = reverseX * 10 + xx % 10;
            xx = xx / 10;
        }
        return reverseX == x;
    }
}
