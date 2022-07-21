/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class PopulateNextRightPointer {
    public Node connect(Node root) {
        /*
        Runtime: 2 ms, faster than 58.68% of Java online submissions for Populating Next Right Pointers in Each Node.
Memory Usage: 48.7 MB, less than 6.27% of Java online submissions for Populating Next Right Pointers in Each Node.
        */
        if(root==null) return root;
        Queue<Node> queue=new LinkedList<>();
        Node head=root;
        queue.offer(root);
        while(!queue.isEmpty())
        {
            Node prev=null;
            int size=queue.size();
            for(int i=0;i<size;i++)
            {
                Node node=queue.poll();
                if(node.left!=null)
                {
                    queue.offer(node.left);
                }
                
                if(node.right!=null)
                {
                    queue.offer(node.right);
                }
                if(prev==null)
                {
                    prev=node;
                }
                else
                {
                    prev.next=node;
                    prev=prev.next;
                }
                
                prev.next=null;
            }
        }
        return head;
    }
}
