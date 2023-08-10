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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
                return 0;
            }
            int left_d=diameterOfBinaryTree(root.left);
            int right_d=diameterOfBinaryTree(root.right);
            int s_d=height(root.left)+height(root.right)+2;
            return Math.max(s_d, Math.max(right_d,left_d));
    }
     public int height(TreeNode root){
            if(root==null){
                return -1;
            }
            int left_h=height(root.left);
            int right_h=height(root.right);
            return Math.max(left_h, right_h)+1;
        }
}
