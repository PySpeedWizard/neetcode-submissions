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
    TreeNode temp ;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);

        if(left == null){
            return right;
        }else if(right == null){
            return left;
        }
        else{
            return root;
        }
    

    }
    //  public void helper(TreeNode root, TreeNode p, TreeNode q) {
       

    //      if(root == null) return ;
    //      if(p.val < root.val && q.val > root.val){
    //         temp = root;
    //         return ;
    //      } 
    //      if(q.val < root.val && p.val < root.val){
    //         temp = root.left;
    //         return;
    //      }
    //      if(p.val > root.val && q.val > root.val){
    //         temp = root.right;
    //         return;
    //      }
    }

