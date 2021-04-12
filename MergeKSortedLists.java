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
class MergeKSortedLists {
    /*
    Runtime: 6 ms, faster than 28.58% of Java online submissions for Merge k Sorted Lists.
    Memory Usage: 40 MB, less than 93.38% of Java online submissions for Merge k Sorted Lists.
    */
    ArrayList<Integer> flist=new ArrayList<>();
    ListNode head=null,temp=null;

    public ListNode mergeKLists(ListNode[] lists) {
        if((lists==null||lists.length==0)) return null;
        if(lists.length==1)
        {
            if((lists[0]==null)) return null;
            else return lists[0];
        }
        int size=lists.length;
        int cnull=0;
        while(cnull!=size)
        {
            
            ArrayList<Integer> nums=new ArrayList<>();
            for(int i=0;i<lists.length;i++)
            {
                if(lists[i]!=null) nums.add(lists[i].val);
                    
            }
            //Collections.sort(nums);
            flist.addAll(nums);
            cnull=0;
            
            for(int j=0;j<lists.length;j++)
            {
                if(lists[j]!=null)lists[j]=lists[j].next;
                else{ cnull++;}
            }
            
        }
        Collections.sort(flist);
        for(int i=0;i<flist.size();i++)
        {
            if(head==null)
            {
                head=new ListNode(flist.get(i));
                temp=head;
                
            }
            else
            {
                temp.next=new ListNode(flist.get(i));
                temp=temp.next;
            }
        
        }
        
        return head;
        
    }
    
    
}
