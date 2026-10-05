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
       return helper(root, root.val);

    }
    public int helper(TreeNode root , int maxSec){
        if(root == null) return 0;
        int count  = 0;
         if(root.val >= maxSec){
             count = 1;
             maxSec = root.val;
         }

         count = count + helper(root.left,maxSec);
         count = count + helper(root.right, maxSec);
    

        
        return count;
    }
     
}
