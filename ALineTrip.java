import java.util.*;
public class ALineTrip{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++) a[i] = sc.nextInt();
            int max=a[0];
            for(int i=1;i<n;i++){
                int d = a[i]-a[i-1];
                if(d>max) max=d;
            }
            int returnx = 2 * (x-a[n-1]);
            if(returnx > max) max = returnx;
            System.out.println(max);
        }
    }
}