/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_771_Jewels_and_Stones;

/**
 *
 * @author limyiter
 */
public class Solution {

    public int numJewelsInStones(String J, String S) {
        int result = 0;
        int jlen = J.length();
        int slen = S.length();
        char[] jchars = J.toCharArray();
        char[] schars = S.toCharArray();
        for (int i = 0; i < slen; i++) {
            for (int j = 0; j < jlen; j++) {
                if (schars[i] == jchars[j]) {
                    result++;
                    break;
                }
            }
        }
        return result;
    }
}
