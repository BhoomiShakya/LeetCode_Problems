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
    public int sumNumbers(TreeNode root) {
        return solution(root,0);
    }
    public int solution(TreeNode root, int sum){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return sum*10+root.val;
        }

        int left=solution(root.left,sum*10+root.val);
        int right=solution(root.right,sum*10+root.val);
        return left+right;
    }
}
