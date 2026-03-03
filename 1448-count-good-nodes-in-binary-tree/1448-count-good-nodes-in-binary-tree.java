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
    public int goodNodes(TreeNode root) {
        return count(root,Integer.MIN_VALUE);
        
    }
    public int count(TreeNode root,int max)
    {
        int c=0;
        if(root==null)
        {return 0;}
        if(root.val>=max)
        {c=1;
        max=root.val;}
        else
        {c=0;}
        c+=count(root.left,max);
        c+=count(root.right,max);
        return c;
    }
}