/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_65_Vaild_Number;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public boolean isNumber(String s) {
        if (s.trim().isEmpty()) {
            return false;
        }
        String regex = "[-+]?(\\d+\\.?|\\.\\d+)\\d*(e[-+]?\\d+)?"; 
        if (s.trim().matches(regex)) {
            return true;
        }else{
            return false;
        }
    }
}
