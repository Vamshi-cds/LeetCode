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
class Solution {
    public int rob(TreeNode root) {
        int[] result = dfs(root);
        return Math.max(result[0], result[1]);
    }

    // returns an array of two values:
    // result[0] = max money if we do NOT rob this node
    // result[1] = max money if we DO rob this node
    private int[] dfs(TreeNode node) {
        if (node == null) return new int[2];

        int[] left = dfs(node.left);
        int[] right = dfs(node.right);

        int rob = node.val + left[0] + right[0]; // rob this node → can’t rob children
        int notRob = Math.max(left[0], left[1]) + Math.max(right[0], right[1]); // skip this node

        return new int[]{notRob, rob};
    }
}