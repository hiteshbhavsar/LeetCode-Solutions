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
class MaxLevelSum {
    public int maxLevelSum(TreeNode root) {
        // Write your code here
        if (root == null) {
			return 0;
		}
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		int l = 1;
		q.offer(root);
		int maxl = 1;
		int maxsum = 0;

		while (!q.isEmpty()) {

			int size = q.size();

			int sum = 0;
			for (int i = 0; i < size; i++) {

				TreeNode poll = q.poll();
				sum = sum + poll.val;
				if (poll.left != null) {
					q.offer(poll.left);
				}
				if (poll.right != null) {
					q.offer(poll.right);
				}

			}
			if (sum > maxsum) {
				maxsum = sum;
				maxl = l;
			}

			l++;
		}

		return maxl;
    }
}
