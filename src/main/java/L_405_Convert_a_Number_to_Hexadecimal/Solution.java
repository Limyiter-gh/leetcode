/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_405_Convert_a_Number_to_Hexadecimal;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    char[] map = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        String result = "";
        while (num != 0) {
            result = map[(num & 0xF)] + result;
            num = (num >>> 4);
        }
        return result;
    }
}
