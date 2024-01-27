/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        int []arr= new int[100000];
        int idx=0;
        while(head != null){
            arr[idx++]=head.val;
            head=head.next;
        }
        int maxx=0;
        for(int i=0;i<idx/2;i++){
            int sum=arr[i]+arr[idx-1-i];
            maxx=Math.max(sum, maxx);
        }
        return maxx;
    }
}
