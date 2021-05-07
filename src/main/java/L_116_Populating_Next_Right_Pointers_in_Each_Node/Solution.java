/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_116_Populating_Next_Right_Pointers_in_Each_Node;

/**
 *
 * @author Li Mingyang
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            root.left.next = root.right;
        }
        if (root.right != null) {
            if (root.next != null) {
                root.right.next = root.next.left;
            }else{
                root.right.next = null;
            }
        }
        connect(root.left);
        connect(root.right);
    }
}
