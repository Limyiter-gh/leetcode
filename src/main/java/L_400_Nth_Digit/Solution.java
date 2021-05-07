/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_400_Nth_Digit;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int findNthDigit(int n) {
        int i = 1;  //i表示数字位数，比如数字123是3位  
        int m = n;
        int num = 0;  //第nth所属数字  
        int bit = 0; //第n位位于所属数字的第bit位（从左数）  
        if (n < 10) {
            return n;
        }
        while (n > i * 9 * Math.pow(10, i - 1))//数字位数为1的有9个，2的有90个，3的有900个。。。  
        {
            m -= i * 9 * Math.pow(10, i - 1);
            i++;
        }//获取到n是多少位的
        num = (int) ((m - 1) / i + Math.pow(10, i - 1));
        //获取包涵结果的那个数字
        bit = (m - 1) % i + 1;
        while (bit != i) {
            num = num / 10;
            i--;
        }
        return num % 10;
    }
}
