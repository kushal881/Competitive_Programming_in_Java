import java.util.*;
public class ASoftDrinking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();
        int drinks = k*l;
        int toast1 = drinks/nl;
        int limes = c*d;
        int salt = p/np;
        if(toast1<limes && toast1<salt){
            System.out.println(toast1/n);
        }
        else if(limes<toast1 && limes<salt){
            System.out.println(limes/n);
        }
        else{
            System.out.println(salt/n);
        }
    }
}
