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
    private int maxDiameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
       return maxDiameter;
    }
    private int height(TreeNode root){
        if(root==null){
            return 0;
        }
         int leftHt=height(root.left);
        int rightHt=height(root.right);
        maxDiameter=Math.max(maxDiameter,leftHt+rightHt);
        return Math.max(leftHt,rightHt)+1;
    }
}