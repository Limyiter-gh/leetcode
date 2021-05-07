/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_476_Number_Complement;

/**
 *
 * @author Li Mingyang
 */
public class Solution {
    public int findComplement(int num) {
        int ans = 0;//the count of the num's bits
        int temp = num;//copy of the num
        while(temp != 0){
            ans++;
            temp /= 2;
        }
        return num ^ (int)(Math.pow(2,ans)-1);
    }
}
