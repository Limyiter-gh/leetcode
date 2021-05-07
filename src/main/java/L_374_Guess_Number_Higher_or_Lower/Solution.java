/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_374_Guess_Number_Higher_or_Lower;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    int guess(int num){
        return num;
    };

    int guessNumber(int n) {
        if (guess(n) == 0) {
            return n;
        }
        int left = 1, right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (guess(mid) == 0) {
                return mid;
            } else if (guess(mid) == 1) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
