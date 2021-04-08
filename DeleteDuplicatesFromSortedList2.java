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
class DeleteDuplicatesFromSortedList2 {
    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Duplicates from Sorted List II.
Memory Usage: 38.5 MB, less than 35.97% of Java online submissions for Remove Duplicates from Sorted List II.
    */
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        if(head!=null && head.next==null) return head;
        ListNode slow=head;
        ListNode fast=head.next;
        ListNode newhead=null,tail=null;
        boolean isMatchedbefore=false;
        while(fast!=null)
        {
            //System.out.println("Slow Pointer : "+slow.val);
            if(slow.val!=fast.val)
            {
                if(!isMatchedbefore)
                {
                    if(tail==null)
                    {
                        tail=new ListNode(slow.val);
                        newhead=tail;
                    }
                    else
                    {
                        tail.next=new ListNode(slow.val);
                        tail=tail.next;
                    }
                }
                isMatchedbefore=false;
            }
            else
            {
                isMatchedbefore=true;
            }
            slow=slow.next;fast=fast.next;
        }
        
        if(!isMatchedbefore) {
            if(tail==null)
            {
                newhead=new ListNode(slow.val);
            }
            else
            {
                tail.next=new ListNode(slow.val);
                tail=tail.next;
            }
        }
        return newhead;
    }
}
