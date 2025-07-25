package Queues.java;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackImplementation {
    public static class Stack{
        Queue<Integer> q = new LinkedList<>();
        public void push(int x){
            q.add(x);
        }
        public int peek(){
            for(int i=1;i<=q.size()-1;i++){
                q.add(q.remove());
            }
            int x = q.peek();
            q.add(q.remove());
            return x;
        }
        public int pop(){
            for(int i=1;i<=q.size()-1;i++){
                q.add(q.remove());
            }
            int x = q.peek();
            q.remove(q.peek());
            return x;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(5);
        st.push(2);
        st.push(1);
        st.push(7);
        System.out.print(st.peek());

    }
}
