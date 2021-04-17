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
class ConvertsortedArrayToBST {
  /*
  Runtime: 0 ms, faster than 100.00% of Java online submissions for Convert Sorted Array to Binary Search Tree.
Memory Usage: 38.6 MB, less than 57.34% of Java online submissions for Convert Sorted Array to Binary Search Tree.
  */
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums==null||nums.length==0) return null;
        if(nums.length==1) return new TreeNode(nums[0]);
        return constructBinaryTreeFromArray(nums,0,nums.length-1);
    }

    public TreeNode constructBinaryTreeFromArray(int nums[],int i,int j)
    {
        if(i>j) return null;
        int mid=i+(j-i)/2;
        TreeNode node= new TreeNode(nums[mid]);
        node.left=constructBinaryTreeFromArray(nums,i,mid-1);
        node.right=constructBinaryTreeFromArray(nums,mid+1,j);
        return node;
    }

    /*
    public TreeNode generateBST(TreeNode root,int data)
    {
        if(root==null){
            return new TreeNode(data);
        }
        else{
            TreeNode cur;
            if(data<=root.val){
                cur=generateBST(root.left,data);
                root.left=cur;
            }
            else{
                cur=generateBST(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    */
}
