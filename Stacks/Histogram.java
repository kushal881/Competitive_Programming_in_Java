package Stacks;

import java.util.Stack;
 
public class Histogram {
    public static int histogram(int[] heights){
        int n = heights.length;
        int[] nse = new int[n];
        int[] pse = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(n-1);
        nse[n-1] =  n;
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 &&  heights[st.peek()] >= heights[i] ){
                st.pop();
            }
            if(st.size()==0)
                nse[i] = n;
            else
                nse[i] = st.peek();
            st.push(i);
        }
        while(st.size()>0) st.pop();
        st.push(0);
        pse[0] = -1;
        for(int i=1;i<n;i++){
            while(st.size()>0 &&  heights[st.peek()] >= heights[i] ){
                st.pop();
            }
            if(st.size()==0)
                pse[i] = -1;
            else
                pse[i] = st.peek();
            st.push(i);
        }
        int max = -1;
        for(int i=0;i<n;i++){
            int area = heights[i]*(nse[i]-pse[i]-1);
            if(max<area)  max=area;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        System.out.println(histogram(heights));
    }
}
