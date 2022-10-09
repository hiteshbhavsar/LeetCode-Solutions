class BSTKTHSMALLEST {
    /*
    Runtime: 1 ms, faster than 81.54% of Java online submissions for Kth Smallest Element in a BST.
Memory Usage: 45.9 MB, less than 20.68% of Java online submissions for Kth Smallest Element in a BST
    */
  public int kthSmallest(TreeNode root, int k) {
    LinkedList<TreeNode> stack = new LinkedList<>();

    while (true) {
      while (root != null) {
        stack.push(root);
        root = root.left;
      }
      root = stack.pop();
      if (--k == 0) return root.val;
      root = root.right;
    }
  }
}
