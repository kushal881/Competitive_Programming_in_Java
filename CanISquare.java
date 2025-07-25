import java.util.*;
public class CanISquare{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long sum = 0;
            while(n-- > 0){
                long a  = sc.nextLong();
                sum+=a;
            }
            long r = (long)Math.sqrt(sum);
            if(r*r==sum) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}