/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_172_Factoral_Trailing_Zeroes;

/**
 *
 * @author Li Mingyang
 */
public class Solution {
    public int trailingZeroes(int n) {
        int answer = 0;
        while (n!=0) {            
            answer += n/5;
            n = n/5;
        }
        return answer;
    }
}
