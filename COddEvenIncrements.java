import java.util.*;
public class COddEvenIncrements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i]=sc.nextInt();
            int s=0;
            int f=1;
            int count=0;
            while(f<n-1){
                if(f+1<n && arr[s]%2!=arr[f+1]%2){
                    System.out.println("NO");
                    count=1;
                    break;
                }
                s=f+1;
                if(s+1<n && arr[f]%2!=arr[s+1]%2){
                    System.out.println("NO");
                    count=1;
                    break;
                }
                f=s+1;
            }
            if(count==0) System.out.println("YES");
        }
    }
}
