import java.util.*;

public class AInsomniacure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int l = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int d = sc.nextInt();
        int count=0;
        for(int i=1;i<=d;i++){
            if(i%k==0) count++;
            else if(i%l==0 ) count++;
            else if(i%m==0 ) count++;
            else if(i%n==0 ) count++;
        }
        System.out.println(count);
    }
}
