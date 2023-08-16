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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
       return  solution(nums,0,nums.length-1);
    }
    public TreeNode solution(int []arr, int s , int e){
        if(s>e){
            return null;
        }
        int max=0;
        int root=0;
        for(int i=s;i<=e;i++){
            if(arr[i]>=root){
                root=arr[i];
                max=i;
            }
        }
        TreeNode nn= new TreeNode(root);
        nn.left=solution(arr,s,max-1);
        nn.right=solution(arr,max+1,e);
        return nn;
    }
}
