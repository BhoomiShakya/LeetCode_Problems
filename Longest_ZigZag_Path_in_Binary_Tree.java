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
    public int maxlen=0;
    public  void solution(TreeNode root, String d, int len ){
        if(root==null){
            return;
        }
        maxlen=Math.max(maxlen,len);
        if(d=="R"){
            solution(root.left,"L", len+1);
            solution(root.right,"R",1);
        }
        else{
            solution(root.right,"R",len+1);
            solution(root.left,"L",1);
        }

    }
    public int longestZigZag(TreeNode root) {
        solution(root, "L", 0);
        solution(root, "R", 0);
        return maxlen;
    }
}
