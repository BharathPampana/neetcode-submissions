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
    public List<Integer> rightSideView(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();

        if(root == null)return ans;
        q.add(root);
        while(!q.isEmpty())
        {
            int s = q.size();
            for(int i=0;i<s;i++)
            {
                TreeNode x = q.remove();
                if(i==s-1)ans.add(x.val);
                if(x.left != null)q.add(x.left);
                if(x.right !=null)q.add(x.right);
            }
        }
        return ans;
    }
}
