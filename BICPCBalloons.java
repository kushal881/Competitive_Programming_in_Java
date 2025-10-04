import java.util.*;
public class BICPCBalloons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0){
            int a = sc.nextInt();
            String str = sc.next();
            int[] arr = new int[26];
            int sum=0;
            for(int i=0;i<str.length();i++){
                arr[str.charAt(i)-'A']++;
            }
            for(int i=0;i<arr.length;i++){
                if(arr[i]>0) {

                    sum += arr[i] + 1;
                }
            }
            System.out.println(sum);
            n--;
        }
    }
}
