import java.util.*;
public class AWrongSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n  =sc.nextInt();
        int k = sc.nextInt();
        while(k-->0){
            int digit = n%10;
            if(digit!=0) n--;
            else n=n/10;
        }
        System.out.println(n);
    }
}
