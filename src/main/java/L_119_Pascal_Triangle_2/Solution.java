/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_119_Pascal_Triangle_2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Li Mingyang
 */
public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> answerList = new ArrayList<>(rowIndex);
        if (rowIndex < 0) {
            return answerList;
        }
        for (int i = 0; i <= rowIndex; i++) {
            System.out.println("i " + i);
            answerList.add(1);
            for (int j = i-1; j > 0; j--) {
                System.out.println("j " + j);
                answerList.set(j,answerList.get(j-1) + answerList.get(j));
            }
        }
        return  answerList;
    }
}
