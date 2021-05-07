/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_709_To_Lower_Case;

/**
 *
 * @author limyiter
 */
public class Solution {

    public String toLowerCase(String str) {
        char[] strs = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char t : strs) {
            if (t >= 65 && t <= 90) {
                //说明t是大写字母
                sb.append((char)(t + 32));
            } else {
                sb.append(t);
            }
        }

        return sb.toString();
    }
}
