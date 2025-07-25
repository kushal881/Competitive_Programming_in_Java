package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class DisplayRec {
    public static void displayRec(Stack<Integer> st){
        if(st.size()==0) return;
        int top = st.pop();
        displayRec(st);
        System.out.print(top+" ");
        st.push(top);
    }
    public static void pushAtBotttom(Stack<Integer> st,int k){
        if(st.size() ==0)  {
            st.push(k);
            System.out.print(st.peek()+" ");
            return;
        }
        int top = st.pop();
        pushAtBotttom(st,k);
        System.out.print(top+" ");
        st.push(top);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        System.out.println("Enter elements: ");
        while(n>0){
            st.push(sc.nextInt());
            n--;
        }
        displayRec(st);
        System.out.println("Enter number: ");
        int k = sc.nextInt();
        pushAtBotttom(st,k);
    }
}
