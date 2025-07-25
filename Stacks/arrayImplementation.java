package Stacks;

public class arrayImplementation {
    public static class Stack{
        int[] arr = new int[5];
        int idx = 0;
        void push(int a){
            if(isFull()){
                System.out.println("Stack is Full!");
                return;
            }
            arr[idx] = a;
            idx++;
        }
        int peek(){
            if(idx==0) return -1;
            return arr[idx-1];
        }
        int pop(){
            if(idx==0) return -1;
            int top = arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }
        void diplay(){
            for(int i=0;i<=idx-1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
        boolean isEmpty(){
            if(idx==0) return true;
            else return false;
        }
        boolean isFull(){
            if(arr.length==idx) return true;
            else return false;
        }
        int capacity(){
            return arr.length;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.push(5);
        st.push(8);
        st.push(9);
        st.diplay();
        st.pop();
        st.diplay();
        System.out.println(st.size());
        System.out.println(st.peek());
        System.out.println(st.capacity());
    }
}
