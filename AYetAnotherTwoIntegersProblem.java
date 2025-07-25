//import java.util.*;
//public class AYetAnotherTwoIntegersProblem {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while(t-- > 0){
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            int count = 0;
//            if(a<b){
//                while(a!=b){
//                    int diff = b-a;
//                    if(diff>10){
//                        a=a+10;
//                        count++;
//                    }
//                    else{
//                        a=a+diff;
//                        count++;
//                    }
//                }
//            }
//            else{
//                while(a!=b){
//                    int diff = a-b;
//                    if(diff>10){
//                        a=a-10;
//                        count++;
//                    }
//                    else{
//                        a=a-diff;
//                        count++;
//                    }
//                }
//            }
//            System.out.println(count);
//        }
//    }
//}

//                                          OPTIMIZE SOLUTION

import java.util.*;

public class AYetAnotherTwoIntegersProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int diff = Math.abs(a - b);
            int moves = (diff + 9) / 10;
            System.out.println(moves);
        }
    }
}
