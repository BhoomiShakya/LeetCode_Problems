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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList <Integer> list= new ArrayList<>();
        solution(root, list);
        return list;
    }
    private void solution(TreeNode nn, List<Integer> list){
        if(nn==null){
            return;
        }
        solution(nn.left, list);
        list.add(nn.val);
        solution(nn.right, list);
    }
}
