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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int c=0;
        ListNode l3= new ListNode();
        ListNode head=l3;
        while(l1!=null || l2!= null || c!=0){
            int val1;
            int val2;
            if(l1==null){
                val1=0;
            }
            else{
                val1=l1.val;
            }
            if(l2==null){
                val2=0;
            }
            else{
                val2=l2.val;
            }
            int s=val1+val2+c;
            if(s>9){
                c=1;
                s=s%10;
            }
            else{
                c=0;
            }
            head.val=s;
            if(l1!=null && l1.next != null){
                l1=l1.next;
            }
            else{
                l1=null;
            }
            if(l2!=null && l2.next != null){
                l2=l2.next;
            }
            else{
                l2=null;
            }
            if(l1!=null || l2!=null || c!=0){
                head.next=new ListNode();
                head=head.next;
            }
        }
        return l3;
    }
}
