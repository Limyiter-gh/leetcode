/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_455_Assign_Cookies;

import java.util.Arrays;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    //题目比较简单清晰，既然是饼干尺寸不小于期望尺寸，那么我们首先将两个数组先排序。
    //遍历期望尺寸的数组和饼干尺寸的数组，如果饼干尺寸符合则两个数组都向前进一，表示有一个饼干满足了一个小孩；
    //如果饼干尺寸不符合，则饼干数组向前进一，尝试下一个饼干
    public int findContentChildren(int[] g, int[] s) {
        int ret = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0;
        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                ret++;
                i++;
                j++;
            } else if (g[i] > s[j]) {
                j++;
            }
        }
        return ret;
    }
}
