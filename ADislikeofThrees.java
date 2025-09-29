import java.util.*;
public class ADislikeofThrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new  int[1000];
        int n=0;
        int i=1;
        while(n<1000){
            if(i%3!=0 && i%10!=3){
                arr[n]=i;
                n++;
            }
            i++;
        }
        int t = sc.nextInt();
        while(t-- > 0){
            int k = sc.nextInt();
            System.out.println(arr[k-1]);
        }
    }
}
