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
import java.util.*;
class Solution {
    int maxdepth=0,count=0;
    public void helper(TreeNode root){ 
        if(root==null)
        {
            maxdepth=Math.max(count,maxdepth);
            return;
        }
        count++;
        helper(root.left);
        helper(root.right);
        count--;
    }
    
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
    helper(root);
    return maxdepth;
    
    }
}