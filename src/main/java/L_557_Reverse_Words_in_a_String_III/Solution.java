/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_557_Reverse_Words_in_a_String_III;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder ans = new StringBuilder();
        boolean isFirst = true;
        for(String word : words){
            StringBuilder temp = new StringBuilder(word);
            word = temp.reverse().toString();
            if(isFirst){
                ans.append(word);
                isFirst = false;
            }else{
                ans.append(" " + word);
            }

        }
        return ans.toString();
    }
}
