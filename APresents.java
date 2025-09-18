import java.util.*;

public class APresents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] giftTo = new int[n + 1];
        int[] giftFrom = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            giftTo[i] = sc.nextInt();
            giftFrom[giftTo[i]] = i;
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(giftFrom[i] + " ");
        }
    }
}




//import java.util.*;
//public class APresents {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n+1];
//        int[] an = new int[n+1];
//        for(int i=1;i<=n;i++) {
//            arr[i] = sc.nextInt();
//            an[arr[i]] = i;
//        }
//        for(int i=1;i<=n;i++){
//            System.out.print(an[i]+" ");
//        }
//    }
//}