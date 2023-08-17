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
    int maxdept=0;
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList <Integer> list= new ArrayList<>();
         solution( root,1, list);
         return list;
    }
    public void solution(TreeNode root,int curr, ArrayList <Integer> list){
        if(root==null){
            return;
        }
        if(maxdept<curr){
            list.add(root.val);
            maxdept=curr;
        }
        solution(root.right,curr+1,list);
        solution(root.left,curr+1,list);
        
    }
}/**
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
    int maxdept=0;
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList <Integer> list= new ArrayList<>();
         solution( root,1, list);
         return list;
    }
    public void solution(TreeNode root,int curr, ArrayList <Integer> list){
        if(root==null){
            return;
        }
        if(maxdept<curr){
            list.add(root.val);
            maxdept=curr;
        }
        solution(root.right,curr+1,list);
        solution(root.left,curr+1,list);
        
    }
}
