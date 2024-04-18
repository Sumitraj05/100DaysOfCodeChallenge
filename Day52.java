class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        // Morris Traversal
        TreeNode curr = root;
        ArrayList<Integer> ar = new ArrayList<>();
        while(curr != null){ 
            if(curr.left != null){
                TreeNode pred = curr.left;
                while(pred.right != null && pred.right != curr){
                    pred = pred.right;
                }
                if(pred.right == null){
                    pred.right = curr;
                    curr = curr.left;
                }
                else if(pred.right == curr){
                    pred.right = null;
                    ar.add(curr.val);
                    curr = curr.right;
                }
            }
            else{
                ar.add(curr.val);
                curr = curr.right;
            }
     }
     return ar;
    }
}
