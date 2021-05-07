/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_459_Repeated_Substring_Pattern;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public boolean repeatedSubstringPattern(String s) {
        //获取字符串长度
        int l = s.length();
        //让I为字符串长度的一半，向下取整
        for (int i = l / 2; i >= 1; i--) {
            //如果能被整除，则说明字符串长度是偶数，后一半再拼接前一半就是原字符串
            //如果不能被整除，那说明字符串长度是奇数，那就一直找，找到能整除的为止，如果第一份儿拼接之后的是原字符串，这就是pattern
            //m是一份儿多长
            if (l % i == 0) {
                int m = l / i;
                String subS = s.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < m; j++) {
                    sb.append(subS);
                }
                if (sb.toString().equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }
}
