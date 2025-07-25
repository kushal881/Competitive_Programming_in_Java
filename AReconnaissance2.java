import java.util.*;
public class AReconnaissance2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int a=0;
        int b=0;
        for(int i=0;i<n;i++){
            if(Math.abs(arr[i%n]-arr[(i+1)%n])<min){
                min=Math.abs(arr[i%n]-arr[(i+1)%n]);
                a=i%n;
                b=(i+1)%n;
            }
        }
        a++;
        b++;
        System.out.println(a+" "+b);
    }
}
