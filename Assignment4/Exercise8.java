package Assignment4;

import java.util.*;



public class Exercise8 {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) {
            val = x;
        }
    }

    public static TreeNode balanceBST(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        inOrderTraversal(root, inorder);
        return buildBalancedBST(inorder, 0, inorder.size() - 1);
    }

    private static void inOrderTraversal(TreeNode node, List<Integer> inorder) {
        if (node == null) return;
        inOrderTraversal(node.left, inorder);
        inorder.add(node.val);
        inOrderTraversal(node.right, inorder);
    }

    private static TreeNode buildBalancedBST(List<Integer> inorder, int start, int end) {
        if (start > end) return null;
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(inorder.get(mid));
        node.left = buildBalancedBST(inorder, start, mid - 1);
        node.right = buildBalancedBST(inorder, mid + 1, end);
        return node;
    }

    private static void preOrderPrint(TreeNode node) {
        if (node == null) return;
        System.out.print(node.val + " ");
        preOrderPrint(node.left);
        preOrderPrint(node.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);

        TreeNode balanced = balanceBST(root);
        preOrderPrint(balanced);
    }
}

