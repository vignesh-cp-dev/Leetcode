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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    if(root==null){
        return new ArrayList<>();
    }
    List<List<Integer>> ans=new ArrayList<>();
    Queue<TreeNode> q=new LinkedList<>();
    q.add(root);
    boolean lr=true;
    while(!q.isEmpty()){
    int levelsize=q.size();
    LinkedList<Integer> list=new LinkedList<>();
    for(int i=0;i<levelsize;i++){
    TreeNode curr=q.poll();

    if(lr){
        list.addLast(curr.val);

    }
    else{
    list.addFirst(curr.val);
    }

    if(curr.left!=null) q.add(curr.left);
    if(curr.right!=null) q.add(curr.right);
    }
    ans.add(list);
    lr=!lr;
    }
    return ans;
    }
}