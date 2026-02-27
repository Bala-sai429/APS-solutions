class Solution {
    private void inOrderTraversal(TreeNode root, List<Integer> nodes) {
        if (root != null) {
            inOrderTraversal(root.left, nodes);
            nodes.add(root.val);
            inOrderTraversal(root.right, nodes);
        }
    }

    private TreeNode solve(int left, int right, List<Integer> nodes) {
        if (left > right) return null;
        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(nodes.get(mid));
        node.left = solve(left, mid - 1, nodes);
        node.right = solve(mid + 1, right, nodes);
        return node;
    }

    public TreeNode balanceBST(TreeNode root) {
        List<Integer> nodes = new ArrayList<>();
        inOrderTraversal(root, nodes);
        return solve(0, nodes.size() - 1, nodes);
    }
}