package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class countBrackets {
    public static int isBalanced(String s){
        Stack<Character> st = new Stack<>();
        int n = s.length();
        int count = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='('){
                st.push(ch);
                count++;
            }
            else{
                if(st.size()==0){
                    count--;
                }
                else if(st.peek()=='('){
                    st.pop();
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isBalanced(s));
    }
}
