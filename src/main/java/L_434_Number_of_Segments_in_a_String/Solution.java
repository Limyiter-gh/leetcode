/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_434_Number_of_Segments_in_a_String;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int countSegments(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int result = 0;
        String[] strs = s.split(" ");
        for (String str : strs) {
            if (str.length() != 0) {
                result++;
            }
        }
        return result;
    }
}
