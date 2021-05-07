/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_657_Judge_Route_Circle;

/**
 *
 * @author limyiter
 */
public class Solution {

    public boolean judgeCircle(String moves) {
        int longitude = 0;
        int latitude = 0;
        char[] movess = moves.toCharArray();
        for (char c : movess) {
            switch (c) {
                case 'U':
                    latitude++;
                    break;
                case 'D':
                    latitude--;
                    break;
                case 'L':
                    longitude--;
                    break;
                case 'R':
                    longitude++;
                    break;
                default:
                    break;
            }
        }
        return (latitude == 0) && (longitude == 0);
    }
}
