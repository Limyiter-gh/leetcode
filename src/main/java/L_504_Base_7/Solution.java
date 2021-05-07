/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_504_Base_7;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public String convertToBase7(int num) {
        StringBuffer sb = new StringBuffer("");
        if (num == 0) {
            return "0";
        }
        boolean flag = num > 0 ? false : true;
        num = Math.abs(num);
        while (num != 0) {
            sb.insert(0, num % 7);
            num /= 7;
        }
        if (flag) {
            sb.insert(0, "-");
        }
        return sb.toString();
    }
}
