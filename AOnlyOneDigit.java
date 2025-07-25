import java.util.*;
public class AOnlyOneDigit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int min=Integer.MAX_VALUE;
            while(n!=0){
                int d = n%10;
                if(d<min){
                    min=d;
                }
                n/=10;
            }
            System.out.println(min);
        }
    }
}