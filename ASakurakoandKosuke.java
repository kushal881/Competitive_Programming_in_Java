import java.util.*;
public class ASakurakoandKosuke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int i=1;
            int a = 0;
            int s=0;
            int k=0;
            while(a>=-n && a<=n){
                if(i%2!=0) {
                    a += -(2 * i - 1);
                    s = 1;
                    k=0;
                }
                else {
                    a += (2 * i - 1);
                    k=1;
                    s=0;
                }
                i++;
            }
            if(s==1) System.out.println("Sakurako");
            else System.out.println("Kosuke");
        }
    }
}
