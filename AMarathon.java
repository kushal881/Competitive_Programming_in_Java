import java.util.*;
public class AMarathon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0){
            int count=0;
            int[] arr = new int[4];
            for(int i=0;i<4;i++){
                arr[i] = sc.nextInt();
            }
            for(int i=1;i<4;i++){
                if(arr[0]<arr[i]) count++;
            }
            System.out.println(count);
            n--;
        }
    }
}
