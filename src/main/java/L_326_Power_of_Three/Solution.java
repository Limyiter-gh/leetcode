/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_326_Power_of_Three;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        if (Math.pow(3, Math.round(Math.log(n) / Math.log(3))) == n) {
            return true;
        }
        return false;
    }
}
