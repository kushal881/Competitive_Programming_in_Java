package Stacks;

import java.util.Scanner;
import java.util.Stack;


public class copyStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>(); // Alt + Enter
        System.out.println("Enter the size of the Stack: ");
        int n = sc.nextInt();
        System.out.println("Enter "+ n + "elements in the Stack: ");
        for(int i=1;i<=n;i++){
            st.push(sc.nextInt());
        }
        System.out.println("Your Stack is: ");
        System.out.println(st);
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        System.out.println(rt);
        Stack<Integer> rd = new Stack<>();
        while(rt.size()>0){
            rd.push(rt.pop());
        }
        System.out.println(rd);
    }
}
