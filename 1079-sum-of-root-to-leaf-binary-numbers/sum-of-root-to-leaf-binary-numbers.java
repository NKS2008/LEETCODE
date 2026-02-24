class Solution {
    int sum = 0;

    public int sumRootToLeaf(TreeNode root) {
        dfs(root, 0);
        return sum;
    }

    public void dfs(TreeNode node, int current) {
        if (node == null) return;

        current = current * 2 + node.val;

        if (node.left == null && node.right == null) {
            sum += current;
            return;
        }

        dfs(node.left, current);
        dfs(node.right, current);
    }
}