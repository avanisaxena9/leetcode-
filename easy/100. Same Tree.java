class Solution {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        List ls1 = new ArrayList<>();
        List ls2 = new ArrayList<>();
        inorder(p,ls1);
        inorder(q,ls2);
        System.out.println(ls1+"    "+ ls2);
        if(ls1.equals(ls2)) return true;
        else return false;
    }

    public void inorder(TreeNode a, List ls){
        if(a==null) {
            ls.add("null");
            return;
        }
        ls.add(a.val);
        inorder(a.left,ls);
        inorder(a.right,ls);
    }
}
