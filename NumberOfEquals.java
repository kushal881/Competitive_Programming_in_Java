import java.util.*;
public class NumberOfEquals {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int[] brr = new int[m];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            brr[i] = sc.nextInt();
        }
        int count=0;
        for(int i=0;i<m;i++){
            int start =0;
            int end = m-1;
            while(start<=end){
                int mid = start+(end-start)/2;
                if(brr[i]<=arr[mid]){
                    count++;
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        System.out.print(count);
    }
}
