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
   
    // public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    //     if(root == null || root == p || root == q){
    //         return root;
    //     }
    //     TreeNode left = lowestCommonAncestor(root.left,p,q);
    //     TreeNode right = lowestCommonAncestor(root.right,p,q);

    //     if(left == null){
    //         return right;
    //     }else if(right == null){
    //         return left;
    //     }
    //     else{
    //         return root;
    //     }
    

   // }
   public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode cur = root;

        while (cur != null) {
            if (p.val > cur.val && q.val > cur.val) {
                cur = cur.right;
            } else if (p.val < cur.val && q.val < cur.val) {
                cur = cur.left;
            } else {
                return cur;
            }
        }
        return null;
    }
   
    
    }

