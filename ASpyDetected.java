import java.util.*;
public class ASpyDetected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0){
            int k = sc.nextInt();
            int[] arr = new int[k];
            for(int i=0;i<k;i++){
                arr[i] = sc.nextInt();
            }
            for(int i=1;i<k;i++){
                if(arr[0] != arr[1] && arr[0] !=arr[2]) {
                    System.out.println(1);
                    break;
                }
                if(arr[0] != arr[i]) {
                    System.out.println(i + 1);
                    break;
                }
            }
            n--;
        }
    }
}
