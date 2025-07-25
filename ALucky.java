import java.util.*;
public class ALucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0){
            String str = sc.next();
            int num = Integer.parseInt(str);
            int count =0;
            int sum1=0;
            int sum2=0;
            while(num!=0){
                int d = num%10;
                if(count<3) {
                    sum1 += d;
                    count++;
                }
                else {
                    sum2+=d;
                }
                num/=10;
            }
            if(sum1==sum2) System.out.println("YES");
            else System.out.println("NO");
            n--;
        }
    }
}
