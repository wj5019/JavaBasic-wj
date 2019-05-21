/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
 
    public TreeNode(int val) {
        this.val = val;
 
    }
 
}
*/
public class Solution {
    public int TreeDepth(TreeNode root) {
                if(root==null){
            return 0;
        }
           
        int nLelt=TreeDepth(root.left);
        int nRight=TreeDepth(root.right);
         
        return nLelt>nRight?(nLelt+1):(nRight+1);
    }
}
