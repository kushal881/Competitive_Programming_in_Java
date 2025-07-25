package Assignment4;



public class Exercise5 {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) {
            val = x;
        }
    }

    static class NodeInfo {
        boolean isBST;
        int size, min, max;

        NodeInfo(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    static int maxBSTSize = 0;

    public static int largestBSTSubtree(TreeNode root) {
        maxBSTSize = 0;
        postorder(root);
        return maxBSTSize;
    }

    private static NodeInfo postorder(TreeNode node) {
        if (node == null)
            return new NodeInfo(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);

        NodeInfo left = postorder(node.left);
        NodeInfo right = postorder(node.right);

        if (left.isBST && right.isBST && node.val > left.max && node.val < right.min) {
            int size = 1 + left.size + right.size;
            maxBSTSize = Math.max(maxBSTSize, size);
            int min = Math.min(node.val, left.min);
            int max = Math.max(node.val, right.max);
            return new NodeInfo(true, size, min, max);
        }

        return new NodeInfo(false, 0, 0, 0);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(30);
        root.right = new TreeNode(60);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(20);
        root.right.left = new TreeNode(45);
        root.right.right = new TreeNode(70);
        root.right.right.left = new TreeNode(65);
        root.right.right.right = new TreeNode(80);

        System.out.println("Largest BST Subtree Size: " + largestBSTSubtree(root));
    }
}

