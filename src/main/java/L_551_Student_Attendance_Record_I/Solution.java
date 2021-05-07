/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_551_Student_Attendance_Record_I;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public boolean checkRecord(String s) {
        //.*匹配的是任意字符重复0次或者任意次
        return !s.matches(".*A.*A.*") && !s.matches(".*LLL.*");
    }
}
