import java.util.*;
public class BParitySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] ans = new int[n];
            for(int i=0;i<n;i++) {
                arr[i] = sc.nextInt();
                ans[i]=arr[i];
            }
            Arrays.sort(arr);
            int c=0;
            for(int i=0;i<n;i++){
                if(ans[i]%2!=arr[i]%2) {
                    System.out.println("NO");
                    c++;
                    break;
                }
            }
            if(c==0) System.out.println("YES");
        }
    }
}
