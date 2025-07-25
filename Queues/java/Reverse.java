package Queues.java;

import java.util.*;

//public class Reverse {
//    public static void main(String[] args) {
//        Queue<Integer> q = new LinkedList<>();
//        Stack<Integer> st = new Stack<>();
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        q.add(4);
//        while(q.size()!=0){
//            st.push(q.peek());
//            q.remove();
//        }
//        while(st.size()!=0){
//            q.add(st.peek());
//            st.pop();
//        }
//        System.out.print(q);
//    }
//}



public class Reverse {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int k = sc.nextInt();
        int count = 1;
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while(count<=k){
            st.push(q.peek());
            q.remove();
            count++;
        }
        count=1;
        while(count<=k){
            q.add(st.peek());
            st.pop();
            count++;
        }
        count = 1;
        while(count<=q.size()-k && q.peek()!=null){
            int n = q.peek();
            q.remove();
            q.add(n);
            count++;
        }
        System.out.print(q);
    }
}
