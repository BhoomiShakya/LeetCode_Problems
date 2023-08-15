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
    public ListNode partition(ListNode head, int x) {
        ListNode prev=new ListNode(0);
        ListNode after=new ListNode(0);
        ListNode prev_curr=prev;
        ListNode after_curr=after;
        while(head!=null){
            if(head.val<x){
                prev_curr.next=head;
                prev_curr=prev_curr.next;
            }
            else{
                after_curr.next=head;
                after_curr=after_curr.next;
            }
            head=head.next;
        }
        after_curr.next=null;
        prev_curr.next=after.next;
        return prev.next;
    }
}
