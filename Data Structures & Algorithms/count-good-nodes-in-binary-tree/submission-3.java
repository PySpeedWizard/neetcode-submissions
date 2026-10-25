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
    int max = Integer.MIN_VALUE;
    int min = Integer.MIN_VALUE;
    int count = 0;
    


    public int goodNodes(TreeNode root) {
        helper(root,max,min);
        return count;
    }
    public void helper(TreeNode root, int max, int min){
        if(root == null) return ;

        helper(root.left,Math.max(root.val,max),min);
        helper(root.right, max,Math.max(root.val,min));
         if(root.val >= max && root.val >= min){
            count++;
        }
        
    }
    
}
