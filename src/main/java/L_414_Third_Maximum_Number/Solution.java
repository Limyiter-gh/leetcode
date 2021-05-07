/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_414_Third_Maximum_Number;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int[] tmp = new int[set.size()];
        Iterator it = set.iterator();
        int id = set.size() - 1;
        while (it.hasNext()) {
            tmp[id] = (int) it.next();
            id--;
        }
        if (set.size() < 3) {
            return tmp[0];
        }
        return tmp[2];
    }
}
