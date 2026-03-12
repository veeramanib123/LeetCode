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
    int max=Integer.MIN_VALUE;
    public int maxDepth(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        if(root.left==null && root.right==null)
        {
            return 1;
        }
        return depth(root,1);
    }
    public int depth(TreeNode root,int level)
    {
        if(root==null)
        {return 0;}
        max=Math.max(max,level);
        depth(root.right,level+1);
        depth(root.left,level+1);
        return max;
    }
}