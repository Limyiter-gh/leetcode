/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_258_Add_Digits;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int addDigits(int num) {
        int a = 0;
        if (num < 10) {
            return num;
        } else {
            while (num >= 10) {
                if (num >= 10) {
                    a += num % 10;
                    num = num / 10;
                }
                a += num;
                num = a;
                a = 0;
            }
            return num;
        }
    }
}
