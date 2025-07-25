package Stacks;

import java.util.Scanner;
import java.util.Stack;

//public class InsertAt {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Stack<Integer> st = new Stack<>();
//        System.out.println("Enter the size: ");
//        int n = sc.nextInt();
//        System.out.println("Enter the elements: ");
//        for(int i=1;i<=n;i++){
//            st.push(sc.nextInt());
//        }
//        Stack<Integer> gt = new Stack<>();
//        while(st.size()>0){
//            gt.push(st.pop());
//        }
//        System.out.println("Add the element in the beginning: ");
//        int x = sc.nextInt();
//        gt.push(x);
//        while(gt.size()>0){
//            st.push(gt.pop());
//        }
//        System.out.println(st);
//    }
//}



//                                  INSERT AT ANY INDEX

public class InsertAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.println("Enter the size: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        for(int i=1;i<=n;i++){
            st.push(sc.nextInt());
        }
        System.out.println("Enter element: ");
        int x = sc.nextInt();
        System.out.println("Enter index: ");
        int a = sc.nextInt();
        Stack<Integer> gt = new Stack<>();
        while(st.size()>0){
            if(st.size()==a){
                gt.push(x);
            }
            gt.push(st.pop());
        }
        while(gt.size()>0){
            st.push(gt.pop());
        }
        System.out.println(st);
    }
}












