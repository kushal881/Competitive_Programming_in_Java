import java.util.*;
public class AFafaandhisCompany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        for(int i=1;i<=n/2;i++){
            int t = n-i;
            if(t%i==0) count++;
        }
        System.out.println(count);
    }
}
