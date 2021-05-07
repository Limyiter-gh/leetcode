/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_217_Contains_Duplicate;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int b : nums) {
            if (map.containsKey(b)) {
                return true;
            }else {
                map.put(b, b);
            }
        }
        return false;
    }
}
