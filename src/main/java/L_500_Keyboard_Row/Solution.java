/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_500_Keyboard_Row;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public String[] findWords(String[] words) {
        List<String> oneRowWords = new ArrayList<String>();
        String[] keyboard = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        for (String word : words) {
            String realWord = word;
            word = word.toLowerCase();//每个字母变为小写
            char[] strBit = word.toCharArray();
            int count = 0;
            for (char ch : strBit) {
                //使用indexOf是因为想确认一个String中是否有一个char
                //这个方法如果有就是位置，没有就是-1
                if (keyboard[0].indexOf(strBit[0]) != -1) {//第一个字母在第一排
                    if (keyboard[0].indexOf(ch) == -1) {//其他字母必须也在第一排 否则跳过
                        break;
                    }
                } else if (keyboard[1].indexOf(strBit[0]) != -1) {//第一个字母在第二排
                    if (keyboard[1].indexOf(ch) == -1) {
                        break;
                    }
                } else if (keyboard[2].indexOf(strBit[0]) != -1) {//第一个字母在第三排
                    if (keyboard[2].indexOf(ch) == -1) {
                        break;
                    }
                }
                count++;
            }
            if (count == strBit.length) {
                oneRowWords.add(realWord);
            }
        }
        String[] oneRowWordsArray = new String[oneRowWords.size()];
        for (int i = 0; i < oneRowWords.size(); i++) {
            oneRowWordsArray[i] = oneRowWords.get(i);
        }

        return oneRowWordsArray;
    }
}
