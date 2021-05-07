/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_409_Longest_Palindrome;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int longestPalindrome(String s) {
        //将字符串s转换成字符数组chars[]
        char chars[] = s.toCharArray();
        //分别申明数组保存各个大小写字母（共26个）出现的次数
        int lower[] = new int[26];
        int upper[] = new int[26];
        //保存字符数组中字符出现奇数次的次数
        int odds = 0;
        //循环将chars数组对应大小写字符出现次数保存在对应次数数组中
        for (int i = 0; i < s.length(); i++) {
            //如果chars数组中字符为大写字符
            if (chars[i] < 'a') {
                //按照字符大小顺序对应保存大写字符出现次数
                upper[chars[i] - 'A']++;
            } //如果chars数组中字符为小写字符
            else {
                //按照字符大小顺序对应保存小写字符出现次数
                lower[chars[i] - 'a']++;
            }
        }
        //遍历保存大小写字符出现次数的数组
        for (int j = 0; j < 26; j++) {
            //如果大写字符中存在出现次数为奇数次的字符，odds+1
            if (upper[j] % 2 != 0) {
                odds++;
            }
            //如果小写字符中存在出现次数为奇数次的字符，odds+1
            if (lower[j] % 2 != 0) {
                odds++;
            }
        }
        //如果s中没有出现次数为奇数的字符，返回字符串长度即可
        if (odds == 0) {
            return s.length();
        } //否则，返回字符串长度-出现次数为奇数的字符个数+1
        //即保留出现最大奇数次数的字符
        else {
            //如果出现次数为大于1的奇数n，则可以加入n-1个对应字符到最长回文子串
            //最终的最长回文子串，最中间还可以加入一个单一字符
            return s.length() - odds + 1;
        }
    }
}
