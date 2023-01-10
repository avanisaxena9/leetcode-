/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root.left==null && root.right==null) return true;
        List ls1 = new ArrayList<>();
        List ls2 = new ArrayList<>();
        order1(root.left,ls1);
        order2(root.right,ls2);
        Collections.reverse(ls2);
        System.out.println(ls1+"    "+ ls2);
        if(ls1.equals(ls2)) return true;
        else return false;
    }

    public void order1(TreeNode a, List ls){
        if(a==null) {
            ls.add("null");
            return;
        }
        ls.add(a.val);
        order1(a.left,ls);
        order1(a.right,ls);
        
    }
     public void order2(TreeNode a, List ls){
        if(a==null) {
            ls.add("null");
            return;
        }
        order2(a.left,ls);
        order2(a.right,ls);
        ls.add(a.val);
    }
    
}
