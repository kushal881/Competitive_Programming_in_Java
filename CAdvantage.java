import java.util.*;
public class CAdvantage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            int max = Integer.MIN_VALUE;
            int max2 = Integer.MIN_VALUE;
            int count=0;
            for(int i=0;i<n;i++){
                if(max<arr[i]) {
                    max = arr[i];
                }
            }
            for(int i=0;i<n;i++){
                if(max==arr[i]) {
                    count++;
                }
            }
            for(int i=0;i<n;i++){
                if(max!=arr[i] && max2<arr[i]) max2 = arr[i];
            }
            for(int i=0;i<n;i++){
                if(arr[i]==max && count==1) System.out.print(arr[i]-max2+" ");
                else if(arr[i]==max && count==2) System.out.print(0 + " ");
                else System.out.print(arr[i]-max+" ");
            }
            System.out.println();
        }
    }
}
