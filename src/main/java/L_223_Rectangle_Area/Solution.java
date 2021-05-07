/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_223_Rectangle_Area;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int computeArea(int A, int B, int C, int D,
            int E, int F, int G, int H) {
        int area1 = (C - A) * (D - B);
        int area2 = (G - E) * (H - F);
        if (area1 == 0) {
            return area2;
        }
        if (area2 == 0) {
            return area1;
        }
        int[] x = {A, C, E, G};
        int[] y = {B, D, F, H};
        List<Integer> xList = new ArrayList<>();
        List<Integer> yList = new ArrayList<>();
        int indexX = 0, indexY = 0;
        for (int a : x) {
            if (a <= C && a >= A && a <= G && a >= E) {
                if (!xList.contains(a)) {
                    xList.add(indexX++, a);
                }
            }
        }
        for (int b : y) {
            if (b <= D && b >= B && b <= H && b >= F) {
                if (!yList.contains(b)) {
                    yList.add(indexY++, b);
                }
            }
        }
        if (xList.size() <= 1 || yList.size() <= 1) {
            return area1 + area2;
        }
        int overlap = (xList.get(0) - xList.get(1))
                * (yList.get(0) - yList.get(1));
        return area1 + area2 - Math.abs(overlap);
    }
}

//    private int overlap(int A, int B, int C, int D,
//            int E, int F, int G, int H) {
//        int h1 = Math.max(A, E);
//        int h2 = Math.max(C, G);
//        int h = h2 - h1;
//
//        int v1 = Math.max(B, F);
//        int v2 = Math.max(D, H);
//        int v = v2 - v1;
//
//        if (h <= 0 || v <= 0) {
//            return 0;
//        } else {
//            return h * v;
//        }
//    }
