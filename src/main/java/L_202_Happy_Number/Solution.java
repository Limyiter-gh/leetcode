/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_202_Happy_Number;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public boolean isHappy(int n) {
        Set<Integer> res = new HashSet<>();
        int sum = n;
        while(sum != 1){
            n = sum;
            sum = 0;
            while (n != 0) {                
                sum += (n%10)*(n%10);
                n /=10;
            }
            if (res.contains(sum)) {
                return false;
            }
            res.add(sum);
        }
        return true;
    }
}
