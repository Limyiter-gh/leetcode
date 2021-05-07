/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_36_Vaild_Sudoku;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public boolean isValidSudoku(char[][] board) {
        Set<Character> set = new HashSet<>();
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (set.contains(board[i][j])) {
                    return false;
                }
                set.add(board[i][j]);
            }
            set.clear();
        }

        for (int j = 0; j < 9; j++) {
            for (int i = 0; i < 9; i++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (set.contains(board[i][j])) {
                    return false;
                }
                set.add(board[i][j]);
            }
            set.clear();
        }

        for (int k = 0; k < 9; k++) {
            for (int i = k / 3 * 3; i < (k / 3) * 3 + 3; i++) {
                for (int j = (k % 3) * 3; j < (k % 3) * 3 + 3; j++) {
                    if (board[i][j] == '.') {
                        continue;
                    }
                    if (set.contains(board[i][j])) {
                        return false;
                    }
                    set.add(board[i][j]);
                }
            }
            set.clear();
        }
        return true;
    }
}
