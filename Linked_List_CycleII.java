/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        int l=0;
        while(fast !=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                l=length_cycle(slow);
                break;
            }       
        }
        if(l==0){
            return null;
        }
        ListNode f=head;
        ListNode s=head;
        while(l>0){
            s=s.next;
            l--;
        }
        while(f!=s){
            s=s.next;
            f=f.next;
        }
        return s;
    }

    public static int length_cycle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow ==fast){
                int length=0;
                ListNode temp=slow;
                do{
                    temp=temp.next;
                    length++;
                }while(temp!=slow);
                return length;
            }       
        }
        return 0;
    }
}
