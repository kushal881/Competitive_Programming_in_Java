import java.util.*;
public class AHolidayOfEquality {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int count=0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max<arr[i]) max=arr[i];
        }
        for(int i=0;i<n;i++){
            if(max>arr[i]) count+=max-arr[i];
        }
        System.out.println(count);
    }
}
