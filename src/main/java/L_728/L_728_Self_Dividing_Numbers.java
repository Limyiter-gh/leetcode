/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_728;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author limyiter
 */
public class L_728_Self_Dividing_Numbers {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int j = i;
            for (; j > 0; j = j / 10) {
                if ((j % 10 == 0) || (i % (j % 10)) != 0) {
                    break;
                }
            }
            if (j == 0) {
                list.add(i);
            }
        }
        return list;
    }
}
