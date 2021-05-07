/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_168_Excel_Sheet_Column_Title;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public String convertToTitle(int n) {
        String answer = "";
        while (n != 0) {
            answer = (char) ('A' + (n - 1) % 26) + answer;
            n = (n - 1) / 26;
        }
        return answer;
    }
}
