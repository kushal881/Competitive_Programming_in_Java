import java.util.*;
public class AQuintomania {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int count=0;
            for(int i=0;i<n-1;i++){
                if(Math.abs(arr[i]-arr[i+1])!=5){
                    if(Math.abs(arr[i]-arr[i+1])!=7){
                        count=1;
                        System.out.println("NO");
                        break;
                    }
                }
            }
            if(count==0) System.out.println("YES");
        }
    }
}
