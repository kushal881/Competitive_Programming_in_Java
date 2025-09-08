import java.util.*;
public class APolycarpandSumsofSubsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int[] arr = new int[7];
            for(int i=0;i<7;i++) arr[i]= sc.nextInt();
            int k = arr[6] -  (arr[0]+arr[1]);
            System.out.println(arr[0] + " " + arr[1] + " " + k);
        }
    }
}
