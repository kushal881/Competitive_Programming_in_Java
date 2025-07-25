package BinaryTrees;

public class Height {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }
    static class binaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int X = height(root.left);
        int Y = height(root.right);
        if(X>Y){
            return X+1;
        }
        return Y+1;
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryTree trees = new binaryTree();
        Node root = trees.buildTree(nodes);
        System.out.println(height(root));
    }
}
