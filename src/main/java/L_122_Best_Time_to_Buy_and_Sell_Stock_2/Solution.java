/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_122_Best_Time_to_Buy_and_Sell_Stock_2;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int totalProfit = 0;
        int startIndex = 0;
        int i;
        for (i = 1; i < prices.length; i++) {
            if (prices[i] < prices[i - 1]) {
                totalProfit += prices[i - 1] - prices[startIndex];
                startIndex = i;
            }
        }
        if (prices[i - 1] > prices[startIndex]) {
            totalProfit += prices[i-1] - prices[startIndex];
        }
        return totalProfit;
    }
}
