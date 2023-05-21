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
class RemoveSmallNodesToLeft {
    public ListNode removeNodes(ListNode head) {
        /*
        Runtime: 198 ms, faster than 12.22% of Java online submissions for Remove Nodes From Linked List.
Memory Usage: 58.7 MB, less than 89.24% of Java online submissions for Remove Nodes From Linked List.
        
        */
        ListNode p=head;
        Stack<Integer> stack=new Stack();
        
        if(head!=null)
        {
            stack.push(head.val);
        }
        while(p!=null)
        {
            p=p.next;
            while(p!=null && stack.peek()>=p.val)
            {
                stack.push(p.val);
                p=p.next;
            }
            if(p!=null && stack.peek()<p.val)
            {
                while(p!=null && !stack.isEmpty() && stack.peek()<p.val)
                {
                    stack.pop();
                }
                stack.push(p.val);
            }
        }
        
       
        
        ListNode node=new ListNode(-1);
        ListNode temp=null,head2=null;
        while(!stack.isEmpty())
        {
            if(temp==null)
            {
                temp=new ListNode(stack.pop());
                node=temp;
                head2=node;
                
            }
            else
            {
                node=new ListNode(stack.pop());
                node.next=temp;
                head2=node;
                temp=node;
            }
        }
        
        return head2;
        
    }
}
