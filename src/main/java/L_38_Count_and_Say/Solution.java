/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_38_Count_and_Say;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public String countAndSay(int n) {
        if (n <= 0) {
            return "";
        }
        String answer = "1";
        for (int i = 1; i < n; i++) {
            String tmp = "";
            int count = 0;
            char current = answer.charAt(0);
            int index = 0;
            while (index < answer.length()) {                
                if (answer.charAt(index) == current) {
                    System.out.println("if");
                    count ++;
                }else{
                    System.out.println("else");
                    tmp += Integer.toString(count) + current;
                    System.out.println("tmp += Integer.toString(count) + current;");
                    current = answer.charAt(index);
                    System.out.println("current = answer.charAt(index);");
                    count = 1;
                    System.out.println("count = 1;");
                }
                index ++;
                System.out.println("index ++;");
            }
            tmp += Integer.toString(count) + current;
            answer = tmp;
        }
        return answer;
    }
}
