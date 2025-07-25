package Assignment4;



public class Exercise6 {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) {
            val = x;
        }
    }

    public static TreeNode findLCA(TreeNode root, int n1, int n2) {
        while (root != null) {
            if (n1 < root.val && n2 < root.val)
                root = root.left;
            else if (n1 > root.val && n2 > root.val)
                root = root.right;
            else
                return root;
        }
        return null;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(8);
        root.right = new TreeNode(22);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(12);
        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(14);

        int n1 = 10, n2 = 14;
        TreeNode lca = findLCA(root, n1, n2);
        System.out.println("LCA of " + n1 + " and " + n2 + " is: " + (lca != null ? lca.val : "Not Found"));
    }
}

