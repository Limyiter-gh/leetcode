/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_204_Count_Primes;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int countPrimes(int n) {
        boolean res[] = new boolean[n];
        for (int i = 2; i * i < n; i++) {
            if (!res[i]) {
                for (int j = i; j * i < n; j++) {
                    res[i * j] = true;
                }
            }
        }
        int answer = 0;
        for (int i = 2; i < n; i++) {
            if (res[i] == false) {
                answer++;
            }
        }
        return answer;
    }
}
