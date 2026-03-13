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
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val==val)
        {head=head.next;}
        if(head==null)
        {return head;}
        ListNode p1=head;
        ListNode p2=head.next;
        while(p2!=null)
        {
            if(p2.val==val)
            {
                p1.next=p2.next;
                p2=p1.next;
            }
            else
            {
            p1=p1.next;
            p2=p2.next;
            }
        }
        return p2;
    }
}