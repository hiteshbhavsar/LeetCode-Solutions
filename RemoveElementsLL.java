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
class RemoveElementsLL {
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Linked List Elements.
Memory Usage: 39.6 MB, less than 88.69% of Java online submissions for Remove Linked List Elements.
*/
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val==val){
        head=head.next;
        }
        ListNode curr=head;
        while(curr!=null && curr.next!=null){
        if(curr.next.val == val){
        curr.next = curr.next.next;
        }else{
        curr=curr.next;
        }
        }
        return head;
    }
}
