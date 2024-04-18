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
    int t;
    public void kdown(TreeNode root, TreeNode block, int time){
        if(root==null || root==block)
        return;

        t= Math.max(t,time);
        kdown(root.left,block,time+1);
        kdown(root.right,block,time+1);
    }

    public int distFromRoot(TreeNode root, int tar){
        if(root==null)
        return -1;

        if(root.val==tar){
            kdown(root,null,0);
            return 1;
        }

        int left= distFromRoot(root.left,tar);
        int right= distFromRoot(root.right,tar);

        if(left!=-1){
            kdown(root,root.left,left);
            return left+1;
        }

        if(right!=-1){
            kdown(root,root.right,right);
            return right+1;
        }

        return -1;
    }

    public int amountOfTime(TreeNode root, int start) {
        t=0;
        distFromRoot(root,start);
        return t;
    }
}
