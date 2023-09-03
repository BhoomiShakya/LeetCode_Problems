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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root==null){
            return new ArrayList<>();
        }
        return solution(root,0 , new ArrayList<>(), new ArrayList<>(), targetSum);
    }
    public static List<List<Integer>> solution(TreeNode root, int sum, List<List<Integer>> ans, List<Integer> list, int t ){
        if(root==null){
            return ans;
        }
        list.add(root.val);
        if(root.left==null && root.right==null && sum+root.val==t){
            ans.add(new ArrayList<>(list));
        }
        solution(root.left, sum+root.val, ans, list, t);
        solution(root.right, sum+root.val, ans, list, t);
        list.remove(list.size()-1);
        return ans;
    }
}
