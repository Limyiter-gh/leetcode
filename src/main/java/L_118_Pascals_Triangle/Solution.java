/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_118_Pascals_Triangle;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> resultList = new ArrayList<>();
        if (numRows <= 0) {
            return resultList;
        }
        List<Integer> first = new ArrayList<>();
        first.add(1);
        List<Integer> second = new ArrayList<>();
        second.add(1);
        second.add(1);
        if (numRows == 1) {
            resultList.add(first);
            return resultList;
        } else if (numRows == 2) {
            resultList.add(first);
            resultList.add(second);
            return resultList;
        } else {
            resultList.add(first);
            resultList.add(second);
            for (int i = 3; i <= numRows; i++) {
                List<Integer> temp = new ArrayList<>();
                temp = resultList.get(i-2);
                List<Integer> thisLeveList = new ArrayList<>();
                for (int j = 0; j < i; j++) {
                    if (j == 0 || j ==i-1 ) {
                        thisLeveList.add(1);
                    }else{
                        thisLeveList.add(temp.get(j-1) + temp.get(j));
                    }
                }
                resultList.add(thisLeveList);
            }
            return resultList;
        }
    }
}
