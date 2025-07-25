import java.util.*;
public class BTwoArraysAndSwaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++) {
                b[i] = sc.nextInt();
            }
            Arrays.sort(a);
            Arrays.sort(b);
            int s=1;
            for(int i=0;i<k;i++){
                if(a[i]!= b[n-s] && a[i]<b[n-s]) {
                    int temp = a[i];
                    a[i] = b[n - s];
                    b[n - s] = temp;
                }
                s++;
            }
            int sum=0;
            for(int i=0;i<n;i++){
                sum+=a[i];
            }
            System.out.println(sum);
            t--;
        }
    }
}
