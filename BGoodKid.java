import java.util.*;
public class BGoodKid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  =sc.nextInt();
        while(n>0){
            int k = sc.nextInt();
            int[] arr = new int[k];
            for(int i=0;i<k;i++){
                arr[i]=sc.nextInt();
            }
            int c=0;
            int min = Integer.MAX_VALUE;
            for(int i=0;i<arr.length;i++){
                if(min>arr[i]){
                    min=arr[i];
                    c=i;
                }
            }
            for(int i=0;i<arr.length;i++){
                if(min==arr[i] && c==i){
                    arr[i]=arr[i]+1;
                }
            }
            long mul=1;
            for(int i=0;i<arr.length;i++){
                mul*=arr[i];
            }
            System.out.println(mul);
            n--;
        }
    }
}
