/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_350_Intersection_of_Two_Arrays_II;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> interList = new ArrayList<Integer>();
        for (int num : nums1) {
            list.add(num);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (list.contains(nums2[i])) {
                interList.add(nums2[i]);
                //可以重复，匹配上一个就可以了
                list.remove(list.indexOf(nums2[i]));
            }
        }
        int[] ret = new int[interList.size()];
        int cnt = 0;
        for (int num : interList) {
            ret[cnt++] = num;
        }
        return ret;
    }
}
