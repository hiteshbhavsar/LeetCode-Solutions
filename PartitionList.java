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
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Partition List.
Memory Usage: 38.5 MB, less than 16.61% of Java online submissions for Partition List.
*/
class PartitionList {
    public ListNode partition(ListNode head, int x) {
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode lefthead=null,ltail=null,righthead=null,rtail=null;
        for(ListNode p=head;p!=null;p=p.next)
        {
            if(p.val<x)
            {
                if(lefthead==null)
                {
                    lefthead=new ListNode(p.val);
                    ltail=lefthead;
                }
                else
                {
                    ltail.next=new ListNode(p.val);
                    ltail=ltail.next;
                }
            }
            else
            {
                if(righthead==null)
                {
                    righthead=new ListNode(p.val);
                    rtail=righthead;
                }
                else
                {
                    rtail.next=new ListNode(p.val);
                    rtail=rtail.next;
                }
            }
        }
        
        if(righthead!=null && ltail!=null)
            ltail.next=righthead;
        
        ListNode newhead=(lefthead==null)?righthead:lefthead;
        
        return newhead;
    }
    
    
}
