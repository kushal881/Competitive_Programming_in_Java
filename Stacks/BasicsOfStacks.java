package Stacks;

import java.util.Stack;

public class BasicsOfStacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(23);
        st.push(34);
        st.push(45);
        while(st.size()>1){
            st.pop();
        }
        System.out.println(st);
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.size());
        st.pop();
        System.out.println(st);
    }
}
