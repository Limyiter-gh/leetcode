/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_126_Word_Ladder_2;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public List<List<String>> findLadders(String beginWord, String endWord,
            Set<String> wordList) {
        Map<String, HashSet<String>> neighbours = new HashMap<>();
        wordList.add(beginWord);
        wordList.add(endWord);
        for (String wordList1 : wordList) {
            calcNeighbours(neighbours, wordList1, wordList);
        }

        List<List<String>> answer = new ArrayList<>();
        return answer;
    }

    private void calcNeighbours(Map<String, HashSet<String>> neighbours,
            String str, Set<String> dict) {
        int length = str.length();
        char[] chars = str.toCharArray();
        for (int i = 0; i < length; i++) {
            char old = chars[i];
            for (char c = 'a'; c <= 'z'; c++) {
                if (c == old) {
                    continue;
                }
                chars[i] = c;
                String newStr = new String(chars);
                if (dict.contains(newStr)) {
                    HashSet<String> set = neighbours.get(str);
                    if (set != null) {
                        set.add(newStr);
                    }else{
                        HashSet<String> newSet = new HashSet<>();
                        newSet.add(newStr);
                        neighbours.put(str, newSet);
                    }
                }
            }
            chars[i] = old;
        }
    }

    private void findPath(Node n, ArrayList<ArrayList<String>> result) {
        ArrayList<String> path = new ArrayList<String>();
        Node p = n;
        while (p != null) {
            path.add(0, p.str);
            p = p.parent;
        }
        result.add(path);
    }

    private class Node {

        public Node parent;
        public String str;
        public int level;

        public Node(Node pNode, String s, int l) {
            parent = pNode;
            str = s;
            level = l;
        }
    }
}
