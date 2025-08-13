import java.util.*;
public class AJaggedSwaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i]=sc.nextInt();
            int min = Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                if(min>arr[i]) min=arr[i];
            }
            if(min!=arr[0]) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
