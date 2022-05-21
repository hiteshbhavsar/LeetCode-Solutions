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
class TwoSumBSTs {
    /*
    Runtime: 6 ms, faster than 56.90% of Java online submissions for Two Sum BSTs.
Memory Usage: 51.1 MB, less than 15.33% of Java online submissions for Two Sum BSTs.
    */
  public Set<Integer> inHashset(TreeNode r, int target, Set<Integer> s) {
    if (r == null) return s;
    inHashset(r.left, target, s);
    s.add(target - r.val);
    inHashset(r.right, target, s);
    return s;
  }

  public boolean inCheck(TreeNode r, Set<Integer> s) {
    if (r == null) return false;
    return inCheck(r.left, s) || s.contains(r.val) || inCheck(r.right, s);
  }

  public boolean twoSumBSTs(TreeNode root1, TreeNode root2, int target) {
    Set<Integer> s = inHashset(root1, target, new HashSet());
    return inCheck(root2, s);
  }
}
