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
    int max = Integer.MAX_VALUE;
    int min = Integer.MIN_VALUE;


    public boolean isValidBST(TreeNode root) {
        return dfs(root,max,min);
    }
    public boolean dfs(TreeNode root,int max, int min){
        if(root == null) return true;
        if(root.val >= max || root.val <= min ){
            return false;
        }
        return dfs(root.left,root.val,min) && dfs(root.right,max,root.val);




      
        // if(root.left.val > head.val || root.right.val <= head.val) return false;
        
        // if(root.left.val > root.val || root.right.val <= root.val ) return false;
        
        // return dfs(root.left,head) && dfs(root.right, head);

        

    }
}
