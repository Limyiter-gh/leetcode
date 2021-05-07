/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Li Mingyang
 */
public class LeetCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int[][] a = new int[][]{{1, 0}, {0, 2}};
//        System.out.println(projectionArea(a));
//        String address = "1.1.1.1";
//        System.out.println(defangIPaddr(address));
//        String aaa = "(()())(())";
//        System.out.println(removeOuterParentheses(aaa));
//        int aaa[] = {0, 2, 1, 4};
//        int bbb[] = sortArrayByParity(aaa);
//        int aaa[] = {2, 6, 2, 1};
//        System.out.println(repeatedNTimes(aaa));
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        int aaa[] = {-4, -1, 0, 3, 10};
        aaa = sortedSquares(aaa);
        System.out.println(aaa);
    }

    private static  int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = Math.abs(A[i]) * Math.abs(A[i]);
        }
        int temp = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i+1; j < A.length; j++) {
                if (A[i] > A[j]) {
                    temp = A[j];
                    A[j] = A[i];
                    A[i] = temp;
                }
            }
        }
        return A;
    }

    private static int repeatedNTimes(int[] A) {
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            max = (max < A[i]) ? A[i] : max;
        }
        int b[] = new int[max + 1];
        for (int i = 0; i < A.length; i++) {
            b[A[i]] += 1;
            if (b[A[i]] > 1) {
                return A[i];
            }
        }
        return 0;
    }

    private static int[] sortArrayByParity(int[] A) {
        int[] B = new int[A.length];
        int f = 0, l = A.length - 1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0)//偶数
            {
                B[f++] = A[i];
            } else {
                B[l--] = A[i];
            }
        }

        for (int i = 0; i < A.length; i++) {
            System.out.print(B[i] + " ");
        }
        return B;
    }

    private static String removeOuterParentheses(String S) {
        StringBuilder sb = new StringBuilder();
        char[] word = S.toCharArray();
        int val = 0;
        for (int i = 0; i < word.length; i++) {
            if (word[i] == '(') {
                val++;
                if (val != 1) {
                    sb.append(word[i]);
                }
            } else {
                val--;
                if (val != 0) {
                    sb.append(word[i]);
                }
            }
        }
        return sb.toString();
    }

    private static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

    private static int projectionArea(int[][] grid) {
        int a = 0;
        int b = 0;
        int c = 0;
        //底面
        for (int[] is : grid) {
            a += is.length;
        }
        int zerosize = 0;
        for (int[] is : grid) {
            for (int i : is) {
                if (i == 0) {
                    zerosize++;
                }
            }
        }
        a = a - zerosize;
        //侧面，每个数组中最高的
        int[] topb = new int[grid.length];
        for (int i = 0; i < grid.length; i++) {
            topb[i] = grid[i][0];
            for (int j = 1; j < grid[i].length; j++) {
                if (topb[i] < grid[i][j]) {
                    topb[i] = grid[i][j];
                }
            }
        }
        for (int i : topb) {
            b += i;
        }
        //侧面，所有数组中对应列最高的
        int length = 0;
        for (int[] is : grid) {
            if (length < is.length) {
                length = is.length;
            }
        }
        int[] topc = new int[length];
        for (int i = 0; i < length; i++) {
            for (int[] grid1 : grid) {
                if (grid1.length >= i + 1) {
                    if (topc[i] < grid1[i]) {
                        topc[i] = grid1[i];
                    }
                }
            }
        }
        for (int i : topc) {
            c += i;
        }
        return a + b + c;
    }

    private static int[][] flipAndInvertImage(int[][] A) {
        int tmp = 0;
        for (int[] A1 : A) {
            //先做翻转
            for (int i = 0; i < A1.length / 2; i++) {
                tmp = A1[i];
                A1[i] = A1[A1.length - 1 - i];
                A1[A1.length - 1 - i] = tmp;
            }
            //在做替换
            for (int i = 0; i < A1.length; i++) {
                if (A1[i] == 0) {
                    A1[i] = 1;
                } else {
                    A1[i] = 0;
                }
            }
        }
        return A;
    }

    private static boolean repeatedSubstringPattern(String s) {
        int l = s.length();
        for (int i = l / 2; i >= 1; i--) {
            if (l % i == 0) {
                int m = l / i;
                String subS = s.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < m; j++) {
                    sb.append(subS);
                }
                if (sb.toString().equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }

    static char[] map = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    private static String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        String result = "";
        while (num != 0) {
            result = map[(num & 0xF)] + result;
            num = (num >>> 4);
        }
        return result;
    }

    private static String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder("");
        int start = 0;
        while (start <= s.length()) {
            int i = 0, j = 0;
            if (s.length() - start <= k) {
                i = s.length() - 1;
                j = s.length();
            } else {
                i = start + k - 1;
                j = start + k;
            }
            for (; i >= start; i--) {
                sb.append(s.charAt(i));
            }
            for (; j < s.length() && j < start + 2 * k; j++) {
                sb.append(s.charAt(j));
            }
            start += 2 * k;
        }

        return sb.toString();
    }

    private static int numberOfBoomerangs(int[][] points) {
        //等区间
        int count = 0;
        int n = points.length;
        // 直接统计距离过来就可以
        for (int i = 0; i < n; i++) {
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            for (int j = 0; j < n; j++) {
                //算的是一个距离的平方，只有两位数，所以一个是0,一个是1
                int dis = (points[i][0] - points[j][0]) * (points[i][0] - points[j][0])
                        + (points[i][1] - points[j][1]) * (points[i][1] - points[j][1]);
                if (!map.containsKey(dis)) {
                    map.put(dis, 0);
                }
                //两个位置可以j k可以颠倒，结果应该翻倍
                count += map.get(dis) * 2;
                map.put(dis, map.get(dis) + 1);
            }
        }
        return count;
    }

    private static String convertToBase7(int num) {
        StringBuffer sb = new StringBuffer("");
        if (num == 0) {
            return "0";
        }
        boolean flag = num > 0 ? false : true;
        num = Math.abs(num);
        while (num != 0) {
            sb.insert(0, num % 7);
            num /= 7;
        }
        if (flag) {
            sb.insert(0, "-");
        }
        return sb.toString();
    }

    private static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                res.add(i + 1);
            }
        }
        return res;
    }
}
