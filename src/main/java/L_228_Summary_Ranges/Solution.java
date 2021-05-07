/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_228_Summary_Ranges;

import com.sun.jndi.ldap.Ber;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Li Mingyang
 */
public class Solution {
    
    public List<String> summaryRanges(int[] nums) {
        List<String> answer = new ArrayList<>();
        if (nums == null || nums.length < 1) {
            return answer;
        }
        int s = 0, e = 0;
        while (e < nums.length) {            
            if (e + 1 < nums.length && nums[e + 1] == nums[e] + 1) {
                e++;
            }else{
                if (s == e) {
                    answer.add(Integer.toString(nums[s]));
                }else{
                    String str = nums[s] + "->" + nums[e];
                    answer.add(str);
                }
                e++;
                s = e;
            }
        }
        return answer;
    }
}
