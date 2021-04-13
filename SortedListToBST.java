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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class SortedListToBST {
    
    /*
        Explanation to the solution found on link : https://www.youtube.com/watch?v=5IQF13nNq6A
        
        Runtime: 1 ms, faster than 34.90% of Java online submissions for Convert Sorted List to Binary Search Tree.
Memory Usage: 39.3 MB, less than 96.21% of Java online submissions for Convert Sorted List to Binary Search Tree.
    */
        public TreeNode sortedListToBST(ListNode head) {
            if(head==null)
            {
                return null;
            }
            
            ListNode mid=mid(head);
            TreeNode root=new TreeNode(mid.val);
            
            if(head==mid)
                return root;
            
            root.left=sortedListToBST(head);
            root.right=sortedListToBST(mid.next);
            return root;

        }
        
    public ListNode mid(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        ListNode prev=head;
        
        while(fast!=null && fast.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        
        if(prev!=null)
            prev.next=null;
        return slow;
    }
    /*
    
    // Need to check why the solution is giving wrong result
    TreeNode root=null;
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        //if((head!=null && head.next=null)) return new TreeNode(head.val);
        int count =0;
        ArrayList<Integer> list=new ArrayList<>();
        for(ListNode p=head;p!=null;p=p.next)
        {
            list.add(p.val);
        }
                
        count=list.size();
        System.out.println("Count "+count);
        int index=(count%2==0)?(count+1)/2:count/2;
        System.out.println("Index "+index);
        root=new TreeNode(list.get(index));
        int i=0;
        for(ListNode node=head;node!=null;node=node.next)
        {
            if(i!=index)
                root=constructBST(root,node.val);
             i++; 
        }
        return root;
    }
    
    public TreeNode constructBST(TreeNode root,int value)
    {
        if(root==null)
        {root=new TreeNode(value);}
        else
        {
            
            if(value<root.val)
            {
                root.left=constructBST(root.left,value);        
            }
            else
            {
                root.right=constructBST(root.right,value);
            }
        }
        return root;
        
    }
    */
}
