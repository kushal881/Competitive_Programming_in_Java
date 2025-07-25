import java.util.*;
public class AABAgain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0){
            int a = sc.nextInt();
            int sum = 0;
            while(a!=0){
                int d = a%10;
                sum+=d;
                a/=10;
            }
            System.out.println(sum);
            n--;
        }
    }
}
