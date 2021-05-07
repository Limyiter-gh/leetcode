/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_165_Compare_Version_Numbers;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int compareVersion(String version1, String version2) {
        if (version1 == null || version2 == null) {
            return 0;
        }
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int n1 = v1.length;
        int n2 = v2.length;
        int i = 0;
        while (i < n1 || i < n2) {
            int x1 = i < n1 ? Integer.parseInt(v1[i]) : 0;
            int x2 = i < n2 ? Integer.parseInt(v2[i]) : 0;
            if (x1 > x2) {
                return 1;
            }else if (x1 < x2) {
                return -1;
            }else{
                i ++;
            }
        }
        return 0;
    }
}
