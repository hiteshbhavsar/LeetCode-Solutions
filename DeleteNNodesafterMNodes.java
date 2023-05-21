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
Runtime: 0 ms, faster than 100.00% of Java online submissions for Delete N Nodes After M Nodes of a Linked List.
Memory Usage: 44.8 MB, less than 7.92% of Java online submissions for Delete N Nodes After M Nodes of a Linked List.

*/
class DeleteNNodesafterMNodes {
    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode p=head;
        while(p!=null)
        {
            int c=0,d=0;
            ListNode a=p;
            for(a=p,c=0;a!=null&&c<m-1;c++)
            {
                a=a.next;
            }
            if(a==null)
            {
                break;
            }
            p=a;
            ListNode temp=a;
            for(temp=a,d=0;temp!=null&&d<n;d++)
            {
                temp=temp.next;
            }
            
            if(temp==null)
            {
                p.next=null;
                p=p.next;
            }
            else
            {
                p.next=temp.next; 
                p=p.next;                
            }

        }
        return head;
    }
}
