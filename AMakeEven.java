import java.util.*;
public class AMakeEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  =sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            if((n%10)%2==0) System.out.println(0);
            else {
                int count=0;
                int a=n;
                int rev=0;
                while (a != 0) {
                    int d = a % 10;
                    if (d % 2 == 0) {
                        count = 1;
                    }
                    rev=rev*10+d;
                    a /= 10;
                }
                if(count==0) System.out.println(-1);
                else if((rev%10)%2==0) System.out.println(1);
                else System.out.println(2);
            }
        }
    }
}
