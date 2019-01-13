import java.util.*;
public class Solution {
    public TreeNode convertBST(TreeNode root) {
        if (root == null) return null;
        List<TreeNode> q = new ArrayList<>();
        traverse(q, root);
        for (int i = q.size() - 2; i >= 0; --i) {
            q.get(i).val += q.get(i + 1).val;
        }
        return root;
    }

    public void traverse(List<TreeNode> q, TreeNode root) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            q.add(root);
            return;
        }
        if (root.left != null) {
            traverse(q, root.left);
        }
        q.add(root);
        if (root.right != null) {
            traverse(q, root.right);
        }
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(13);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(8);
        root.right.right = new TreeNode(16);

        var s = new Solution();
        s.convertBST(root);
    }
}
