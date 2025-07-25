package Assignment4;

import java.util.*;



public class Exercise3 {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    Map<String, Integer> map = new HashMap<>();
    List<TreeNode> result = new ArrayList<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        serialize(root);
        return result;
    }

    private String serialize(TreeNode node) {
        if (node == null) return "#";
        String serial = node.val + "," + serialize(node.left) + "," + serialize(node.right);
        map.put(serial, map.getOrDefault(serial, 0) + 1);
        if (map.get(serial) == 2) result.add(node);
        return serial;
    }

    public static void preorder(TreeNode node, List<Integer> list) {
        if (node == null) return;
        list.add(node.val);
        preorder(node.left, list);
        preorder(node.right, list);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(2);
        root.right.left.left = new TreeNode(4);
        root.right.right = new TreeNode(4);

        Exercise3 obj = new Exercise3();
        List<TreeNode> duplicates = obj.findDuplicateSubtrees(root);

        List<List<Integer>> resultList = new ArrayList<>();
        for (TreeNode dup : duplicates) {
            List<Integer> temp = new ArrayList<>();
            preorder(dup, temp);
            resultList.add(temp);
        }

        resultList.sort((a, b) -> {
            int len = Math.min(a.size(), b.size());
            for (int i = 0; i < len; i++) {
                if (!a.get(i).equals(b.get(i))) return a.get(i) - b.get(i);
            }
            return a.size() - b.size();
        });

        for (List<Integer> lst : resultList) {
            for (int val : lst) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

