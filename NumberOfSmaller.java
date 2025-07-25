import java.util.*;
public class NumberOfSmaller {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr=new int[n];
        int[] brr=new int[m];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<m;i++){
            brr[i]=sc.nextInt();
        }

        for(int i=0;i<m;i++){
            int low = 0;
            int high = n;
            while(low<high){
                int mid = low+(high-low)/2;

                if(arr[mid]<brr[i]){
                    low=mid+1;
                }
                else{
                    high=mid;
                }
            }
            System.out.print(low+" ");
        }
    }
}
