/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_149_Max_Points_on_a_Line;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int maxPoints(Point[] points) {
        if (points.length == 0 || points == null) {
            return 0;
        }

        if (points.length == 1) {
            return 1;
        }

        int max = 1;

        for (int i = 0; i < points.length; i++) {
            Map<Float, Integer> hm = new HashMap<>();
            int same = 0;
            int localmax = 1;
            for (int j = 0; j < points.length; j++) {
                if (i == j) {
                    continue;
                }
                if (points[i].x == points[j].x && points[i].y == points[j].y) {
                    same++;
                    continue;
                }
                float slope = ((float)(points[i].y - points[j].y))/(points[i].x - points[j].x);
                if (hm.containsKey(slope)) {
                    hm.put(slope, hm.get(slope) + 1);
                }else{
                    hm.put(slope, 2);
                }
            }
            for (Integer value  : hm.values()) {
                localmax = Math.max(localmax, value);
            }
            localmax += same;
            max = Math.max(max, localmax);
        }
        return max;
    }
}
