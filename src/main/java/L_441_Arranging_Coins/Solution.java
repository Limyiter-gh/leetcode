/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_441_Arranging_Coins;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int arrangeCoins(int n) {
        //(1+x)*x/2 <= n
        //x + x*x <= 2*n
        //4*x*x + 4*x <= 8*n
        //(2*x + 1)*(2*x + 1) - 1 <= 8*n
        //x <= (sqrt(8*n + 1) - 1) / 2
        return (int) ((Math.sqrt(8 * (long) n + 1) - 1) / 2);
    }
}
