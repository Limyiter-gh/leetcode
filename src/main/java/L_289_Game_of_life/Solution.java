/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_289_Game_of_life;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public void gameOfLife(int[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0) {
            return;
        }
        int m = board.length;
        int n = board[0].length;
        // Dead -> Dead : 0 ; Live -> Live : 1 ; Live  -> Dead : 2 ; Dead -> Live : 3 ; 
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int c = countLive(board, i, j);
                //if the cell is currently dead
                if (board[i][j] == 0) {
                    if (c == 3) {
                        board[i][j] = 3; //dead to live 
                    }
                } else {
                //if the cell is currently alive
                    if (c < 2 || c > 3) {
                        board[i][j] = 2; //live to dead
                    }
                }
            }
        }
        // Second iteration, mark 2 to 0 , mark 3 to 1 .
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] % 2 == 0) {
                    board[i][j] = 0;
                } else {
                    board[i][j] = 1;
                }
            }
        }
    }

    // funciton calculating the number of live cells around the cell
    private int countLive(int[][] board, int i, int j) {
        int c = 0;
        for (int x = i - 1; x <= i + 1; x++) {
            for (int y = j - 1; y <= j + 1; y++) {
                if (x < 0 || y < 0 || x >= board.length || y >= board[0].length 
                        || (x == i && y == j)) {
                    continue;
                }
                if (board[x][y] == 1 || board[x][y] == 2) {
                    c++;
                }
            }
        }
        return c;
    }
}
