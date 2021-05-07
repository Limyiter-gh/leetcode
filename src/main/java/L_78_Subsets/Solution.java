/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_78_Subsets;

import com.sun.jndi.ldap.Ber;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        if (nums == null) {
            return null;
        }
        Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            List<List<Integer>> temp = new ArrayList<>();
            for (List<Integer> temp1 : answer) {
                temp.add(new ArrayList<>(temp1));
            }
            for (List<Integer> temp1 : temp) {
                temp1.add(nums[i]);
            }
            List<Integer> single = new ArrayList<>();
            single.add(nums[i]);
            temp.add(single);
            answer.addAll(temp);
        }
        answer.add(new ArrayList<>());
        return answer;
    }
}
