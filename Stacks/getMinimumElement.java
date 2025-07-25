package Stacks;

import java.util.Stack;

public class getMinimumElement {
    public static class MinStack{
        Stack<Integer> st = new Stack<>();
        int min = -1;
        void push(int val){
            if(st.size()==0){
                st.push(val);
                min = val;
            }
            else if(val>=min){
                st.push(val);
            }
            else{
                st.push(2*val-min);
                min=val;
            }
        }
        void pop(){
            if(st.size()==0) return;
            else if(st.peek()>=min)  st.pop();
            else if(st.peek()<min){
                int old = 2*min-st.peek();
                min = old;
                st.pop();
            }
        }
        int top(){
            if(st.size()==0) return -1;
            if(st.peek()>=min)  return st.peek();
            if(st.peek()<min)  return min;
            return 0;
        }
        int getMin(){
            if(st.size()==0) return -1;
            return min;
        }
    }
    public static void main(String[] args) {

    }
}
