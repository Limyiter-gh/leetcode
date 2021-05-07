/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_74_Search_a_2D_Matrix;

import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        int row_num = matrix.length;
        int col_num = matrix[0].length;
        int begin = 0, end = row_num * col_num - 1;
        while (begin <= end) {
            int mid = begin + (end - begin) / 2;
            int mid_value = matrix[mid / col_num][mid % col_num];
            if (mid_value == target) {
                return true;
            } else if (mid_value < target) {
                //Should move a bit further, otherwise dead loop.
                begin = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
//        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
//            return false;
//        }
//        int m = matrix.length;
//        int n = matrix[0].length;
//        if (target>matrix[m-1][n-1] || target < matrix[0][0]) {
//            return false;
//        }
//        int start = 0;
//        int end = m * n - 1;
//        while (start <= end) {
//            int mid = (start + end) >> 2;
//            int midx = mid / n;
//            int midy = mid % n;
//            if (matrix[midx][midy] == target) {
//                return true;
//            }
//            if (matrix[midx][midy] < target) {
//                start = mid + 1;
//            } else {
//                end = mid - 1;
//            }
//        }
//        return false;
    }
}

//        if (matrix.length == 0 || matrix[0].length == 0 || matrix == null) {
//            return false;
//        }
//        int rows = matrix.length;
//        int cols = matrix[0].length;
//        int low = 0;
//        int high = rows * cols - 1;
//        while (low <= high) {
//            int mid = (low + high) >> 2;
//            int midValue = matrix[mid / cols][mid % cols];
//            if (midValue == target) {
//                return true;
//            } else if (midValue < target) {
//                low = mid + 1;
//            } else {
//                high = mid - 1;
//            }
//        }
//        return false;
//        if (matrix == null) {
//            return false;
//        }
//        int m = matrix.length;
//        int n = matrix[0].length;
//        if (target < matrix[0][0] || target > matrix[m - 1][n - 1]) {
//            return false;
//        }
//        for (int i = 0; i < m - 2; i++) {
//            int a = matrix[i][0];
//            int b = matrix[i + 1][0];
//            if (target == a || target == b) {
//                return true;
//            } else if (target > a && target < b) {
//                if (target > matrix[i][n - 1]) {
//                    return false;
//                }
//                for (int j = 0; j < n; j++) {
//                    if (target > matrix[i][j]) {
//                        continue;
//                    } else if (target == matrix[i][j]) {
//                        return true;
//                    } else {
//                        return false;
//                    }
//                }
//            } else {
//                continue;
//            }
//        }
//        return false;
