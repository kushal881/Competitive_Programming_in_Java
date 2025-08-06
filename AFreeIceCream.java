import java.util.*;
public class AFreeIceCream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long x = sc.nextLong();
        int count=0;
        while(t-- > 0){
            char ch = sc.next().charAt(0);
            long a = sc.nextLong();
            if(ch=='+') x+=a;
            else{
                if(x>=a) x-=a;
                else count++;
            }
        }
        System.out.println(x+" "+count);
    }
}
