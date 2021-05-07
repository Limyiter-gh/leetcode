/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_299_Bulls_and_Cows;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public String getHint(String secret, String guess) {
        int numBull = 0;
        int numCow = 0;
        int[] mark = new int[10];
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                numBull++;
            } else {
                if (mark[secret.charAt(i) - '0']++ < 0) {
                    numCow++;
                }
                if (mark[guess.charAt(i) - '0']-- > 0) {
                    numCow++;
                }
            }
        }
        String answer = String.valueOf(numBull) + "A" + String.valueOf(numCow) + "B";
        return answer;
    }
}
