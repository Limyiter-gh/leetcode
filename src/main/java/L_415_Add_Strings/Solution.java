/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_415_Add_Strings;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public String addStrings(String num1, String num2) {
        if (num1.length() == 0) {
            return num2;
        } else if (num2.length() == 0) {
            return num1;
        }

        boolean hasUp = false;// 是否进位
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int n1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int n2 = j >= 0 ? num2.charAt(j) - '0' : 0;
            int sum = n1 + n2 + (hasUp ? 1 : 0);
            if (sum >= 10) {
                sb.insert(0, Integer.toString(sum - 10));
                hasUp = true;
            } else {
                sb.insert(0, Integer.toString(sum));
                hasUp = false;
            }
            i--;
            j--;
        }
        if (hasUp) {
            sb.insert(0, "1");
        }
        return sb.toString();
    }
}
