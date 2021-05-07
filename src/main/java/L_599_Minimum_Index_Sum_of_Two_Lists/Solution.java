/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_599_Minimum_Index_Sum_of_Two_Lists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> minRes = null;
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list1.length; i++) {
            map1.put(list1[i], i);
        }
        for (int i = 0; i < list2.length; i++) {
            map2.put(list2[i], i);
        }
        for (int i = 0; i < list1.length; i++) {
            // 如果map2包含map1的key  
            if (map2.containsKey(list1[i])) {
                int sum = map1.get(list1[i]) + map2.get(list1[i]);
                if (sum < min) {
                    min = sum;
                    // minRes始终存储最小的sum，如果有比这个min小的sum,更新并且重置minRes  
                    // 多次new 了链表可以考虑在多加一个for循环，判断等于最小值的时候加入链表  
                    minRes = new ArrayList<String>();
                    minRes.add(list1[i]);
                } else if (sum == min) {
                    minRes.add(list1[i]);
                }
            }
        }
        String[] strRes = new String[minRes.size()];
        for (int i = 0; i < minRes.size(); i++) {
            strRes[i] = minRes.get(i);
        }
        return strRes;
    }
}
