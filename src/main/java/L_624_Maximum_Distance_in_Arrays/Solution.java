/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_624_Maximum_Distance_in_Arrays;

import java.util.List;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int maxDistance(List<List<Integer>> arrays) {
        int res = 0;
        int min = arrays.get(0).get(0);
        int max = arrays.get(0).get(arrays.get(0).size() - 1);
        for (int i = 1; i < arrays.size(); i++) {
            res = Math.max(res, Math.abs(arrays.get(i).get(arrays.get(i).size() - 1) - min));
            res = Math.max(res, Math.abs(arrays.get(i).get(0) - max));
            max = Math.max(max, arrays.get(i).get(arrays.get(i).size() - 1));
            min = Math.min(min, arrays.get(i).get(0));
        }
        return res;
    }
}
