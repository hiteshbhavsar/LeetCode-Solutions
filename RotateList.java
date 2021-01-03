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
class RotateList {
   public ListNode rotateRight(ListNode head, int k) {
        if(head == null){
            return head;
        }
        int length = lengthOfLinkedList(head);
        k %= length;
        ListNode fn = forwardNode(head,k);
        ListNode cn = head;
        ListNode newHead = rotate(fn,cn, head);
        return newHead;
        
    }
    
    ListNode rotate(ListNode fn , ListNode cn, ListNode head){
        while(fn != null && fn.next != null){
            fn = fn.next;
            cn = cn.next;
        }
        fn.next = head;
        head = cn.next;
        cn.next = null;
        return head;
    }
    
    ListNode forwardNode(ListNode head , int k){
        ListNode curr = head;
        while(curr != null && k-->0){
            curr = curr.next;
        }
        return curr;
    }
    
    int lengthOfLinkedList(ListNode head){
        ListNode curr = head;
        int count = 0;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        return count;
    }
} 

