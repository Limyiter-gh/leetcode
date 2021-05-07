/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_1108_Defanging_an_IP_Address;

/**
 *
 * @author Li Mingyang
 */
public class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
