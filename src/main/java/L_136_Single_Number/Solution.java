/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_136_Single_Number;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int singleNumber(int[] nums) {
        int answer = 0;
        for (int num : nums) {
            answer = answer ^ num;
        }
        return answer;
    }
}
