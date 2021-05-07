/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_135_Candy;

/**
 *
 * @author Li Mingyang
 */
public class Solution {
    public int candy(int[] ratings) {
        if (ratings == null || ratings.length == 0) {
            return 0;
        }
        int[] answer = new int[ratings.length];
        int tmp = 0;
        for (int i = 0; i < answer.length; i++) {
            answer[i] = 1;
        }
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i-1] < ratings[i]) {
                answer[i] = answer[i-1] +1;
            }
        }
        for(int i = ratings.length-2;i>=0;i--){
            if (ratings[i+1] < ratings[i]) {
                tmp = answer[i+1] +1;
                if (tmp > answer[i]) {
                    answer[i] = tmp;
                }
            }
        }
        tmp = 0;
        for (int i = 0; i < answer.length; i++) {
            tmp += answer[i];
        }
        return tmp;
    }
}
