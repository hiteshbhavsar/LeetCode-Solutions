/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
*/

class TreeToDoublyList {
    /*Runtime: 0 ms, faster than 100.00% of Java online submissions for Convert Binary Search Tree to Sorted Doubly Linked List.
Memory Usage: 42.9 MB, less than 22.52% of Java online submissions for Convert Binary Search Tree to Sorted Doubly Linked List.*/
    Node head,tail;
    public Node treeToDoublyList(Node root) {
        if(root==null) return null;
        inOrder(root);
        tail.right=head;
        head.left=tail;
        return head;
    }
    
    public void inOrder(Node root)
    {
        if(root==null) return;
        inOrder(root.left);
        if(head==null)
        {
             head=new Node(root.val);tail=head;
        }
        else
        {
            Node temp;
            tail.right=new Node(root.val);
            temp=tail.right;
            temp.left=tail;
            tail=temp;
            
        }
        inOrder(root.right);
    }
    
}
