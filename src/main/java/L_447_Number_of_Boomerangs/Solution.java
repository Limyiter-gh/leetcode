/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_447_Number_of_Boomerangs;

import java.util.HashMap;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int numberOfBoomerangs(int[][] points) {
        //等区间
        int count = 0;
        int n = points.length;
        // 直接统计距离过来就可以
        for (int i = 0; i < n; i++) {
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            for (int j = 0; j < n; j++) {
                //算的是一个距离的平方，只有两位数，所以一个是0,一个是1
                int dis = (points[i][0] - points[j][0]) * (points[i][0] - points[j][0]) 
                        + (points[i][1] - points[j][1]) * (points[i][1] - points[j][1]);
                if (!map.containsKey(dis)) {
                    //刚与一个点有这个距离，必须要找到多点，才能凑出两个
                    map.put(dis, 0);
                }
                //两个位置可以j k可以颠倒，结果应该翻倍
                count += map.get(dis) * 2;
                map.put(dis, map.get(dis) + 1);
            }
        }
        return count;
    }
}
