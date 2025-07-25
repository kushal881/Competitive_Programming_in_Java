package Assignment4;

import java.util.*;



public class Exercise4 {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) {
            val = x;
        }
    }

    public static List<Integer> diagonalTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode node = q.poll();

            while (node != null) {
                result.add(node.val);
                if (node.left != null)
                    q.add(node.left);
                node = node.right;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(3);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(6);
        root.right.right = new TreeNode(14);
        root.right.right.left = new TreeNode(13);
        root.left.right.left = new TreeNode(4);
        root.left.right.right = new TreeNode(7);

        List<Integer> output = diagonalTraversal(root);
        for (int val : output) {
            System.out.print(val + " ");
        }
    }
}

