import java.util.*;
public class BTeamsForming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new  int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int ans=0;
        int s=0;
        int f=1;
        while(f<n){
            ans+=arr[f]-arr[s];
            s=f+1;
            f=s+1;
        }
        System.out.println(ans);
    }
}
