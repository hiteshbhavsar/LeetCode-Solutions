/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class RemoveNthFromEnd {
    /*
    Runtime: 8 ms, faster than 18.16% of Java online submissions for Remove Nth Node From End of List.
    Memory Usage: 38.7 MB, less than 17.24% of Java online submissions for Remove Nth Node From End of List.
    */
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
