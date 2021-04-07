/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class GetIntersectionNode {
    /*
    Runtime: 7 ms, faster than 24.21% of Java online submissions for Intersection of Two Linked Lists.
Memory Usage: 43.1 MB, less than 17.33% of Java online submissions for Intersection of Two Linked Lists.
    */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA=0,lengthB=0;
        Set<ListNode> list=new HashSet<>();
        while(headA!=null)
        {
            list.add(headA);
            headA=headA.next;
        }
        while(headB!=null)
        {
            if(list.contains(headB)) return headB;
            headB=headB.next;
        }
        return null;
     
    }
}
