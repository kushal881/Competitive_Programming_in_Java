
import java.util.*;
public class AMediumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0){
            int[] arr = new int[3];
            for(int i=0;i<3;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[1]);
            n--;
        }
    }
}
