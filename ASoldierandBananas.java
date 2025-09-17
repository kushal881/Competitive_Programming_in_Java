import java.util.*;
public class ASoldierandBananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int cnt=0;
        for(int i=1;i<=w;i++){
            cnt+=k*i;
        }
        if(cnt<n) System.out.println(0);
        else System.out.println(cnt-n);
    }
}
