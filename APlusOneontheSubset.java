import java.util.*;
public class APlusOneontheSubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            int max = arr[0];
            int min = arr[0];
            for(int i=0;i<n;i++){
                if(max<arr[i]) max = arr[i];
                if(min>arr[i]) min=arr[i];
            }
            System.out.println(max-min);
        }
    }
}
