/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_401_Binary_Watch;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int int2bit(int x) {
        int num = 0, temp = x;
        while(temp != 0) {
            if((temp & 0x01) == 0x01) {
                num++;
            }
            temp >>= 1;
        }
        return num;
    }

    public List<String> readBinaryWatch(int num) {
        if(num < 0 || num > 10) return null;
        List<String> watches = new ArrayList<String>();
        if(num == 0) {
            watches.add("0:00");
            return watches;
        }
        for(int i = 0; i < 12; i++) {
            for(int j = 0; j < 60; j++) {
                if(int2bit(i) + int2bit(j) == num) {
                    if(j < 10)
                        watches.add(i + ":0" + j);
                    else
                        watches.add(i + ":" + j);
                }
            }
        }
        return watches;
    }
}
