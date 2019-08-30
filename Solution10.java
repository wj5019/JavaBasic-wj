public class Solution {
    public void Mirror(TreeNode root) {
        TreeNode temp;//定义一个中间节点
        if(root!=null)
        {
        temp=root.left;
        root.left=root.right;
        root.right=temp;
        if(root.left!=null)
            Mirror(root.left);
        if(root.right!=null)
            Mirror(root.right);
        }
    }
}
