package Stacks;

import java.util.Stack;

public class previousSmallerElement {
    public static int[] previousSmaller(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            while(st.size()>0 &&  st.peek() >= arr[i] ){
                st.pop();
            }
            if(st.size()==0)
                res[i] = -1;
            else
                res[i] = st.peek();
            st.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {5,2,4,6,3,5};
        int[] res = previousSmaller(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
