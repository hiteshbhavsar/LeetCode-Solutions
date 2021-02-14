/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode Node=head;int count=0;ListNode temp;
        Stack<Integer> istack=new Stack<Integer>();
        if(Node==null)
        {
            return null;
        }
         
        while(Node!=null)
        {
            istack.push(Node.val);
            
            Node=Node.next;
        }
        count=1;
        //System.out.println("Stack Size : "+istack.size());
        while(!istack.empty())
        {
            if(count==n)
            {
                istack.pop();    
            }
            if(istack.empty())
            {
                break;
            }
            if(Node==null)
            {
                Node=new ListNode(istack.pop());
                count++;
            }
            else
            {
                temp=new ListNode(istack.pop());
                temp.next=Node;
                Node=temp;
                count++;
            }
        }
        return Node;
    }
}
