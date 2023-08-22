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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> list= new ArrayList<>();
        traversal(root,list);
        // Collections.sort(list);
        return list.get(k-1);
    }
    private void traversal(TreeNode root, ArrayList<Integer> list){
        if(root==null){
            return;
        }
        traversal(root.left, list);
        list.add(root.val);
        traversal(root.right,list);
    }
}
