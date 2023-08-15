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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList <Integer> list= new ArrayList<>();
        solution( root, list);
        return list;
    }
    private void solution(TreeNode nn, ArrayList <Integer> list){
        if(nn==null){
            return;
        }
        list.add(nn.val);
        solution(nn.left,list);
        solution(nn.right,list);
    }
}
