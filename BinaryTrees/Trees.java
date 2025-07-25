package BinaryTrees;

//public class Trees {
//    static class Node{
//        int data;
//        Node left;
//        Node right;
//        Node(int data){
//            this.data = data;
//            this.right = null;
//            this.left = null;
//        }
//    }
//    static class binaryTree{
//        static int idx = -1;
//        public static Node buildTree(int nodes[]){
//            idx++;
//            if(nodes[idx]==-1){
//               return null;
//            }
//            Node newNode = new Node(nodes[idx]);
//            newNode.left = buildTree(nodes);
//            newNode.right = buildTree(nodes);
//            return newNode;
//        }
//    }
//    public static void main(String[] args) {
//        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//        binaryTree trees = new binaryTree();
//        Node root = trees.buildTree(nodes);
//        System.out.println(root.data);
//    }
//}


//                                        IMPLEMENTATION BY USING QUEUES


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Trees {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static void main(String[] args) {
        Queue<Node> q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the root element: ");
        int x = sc.nextInt();
        int f,r;
        Node root = new Node(x);
        q.add(root);
        while(!q.isEmpty()){
            Node temp = q.peek();
            q.poll();
            System.out.println("Enter the left child of "+temp.data);
            f=sc.nextInt();
            if(f!=-1) {
                temp.left = new Node(f);
                q.add(temp.left);
            }
            System.out.println("Enter the right child of "+temp.data);
            r= sc.nextInt();
            if(r!=-1){
                temp.right=new Node(r);
                q.add(temp.right);
            }
        }
    }
}