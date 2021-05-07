/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_606_Construct_String_from_Binary_Tree;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public String tree2str(TreeNode t) {
        if (t == null) {
            return "";
        }
        StringBuilder sbl = new StringBuilder();
        sbl.append(t.val);
        if (t.left != null && t.right == null) {
            sbl.append("(").append(tree2str(t.left)).append(")");
        } else if (t.right != null) {
            sbl.append("(").append(tree2str(t.left)).append(")")
                    .append("(").append(tree2str(t.right)).append(")");
        }
        return sbl.toString();
    }
}
