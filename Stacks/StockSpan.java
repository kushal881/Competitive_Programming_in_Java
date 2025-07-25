package Stacks;

import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int[] arr={100,80,60,70,60,75,85};
        int[] res = new int[arr.length];
        Stack<Integer> st= new Stack<>();
        st.push(0);
        res[0]=1;
        for(int i=1;i<arr.length;i++){
            while(arr[st.peek()]<arr[i]){
                st.pop();
            }
            if(st.size()==0){
                res[i]=1;
            }
            else{
                res[i]=i-st.peek();
            }
            st.push(i);
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(res[i]+" ");
        }

    }
}


