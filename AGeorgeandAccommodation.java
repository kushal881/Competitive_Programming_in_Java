import java.util.*;
public class AGeorgeandAccommodation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int cnt=0;
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(b-a>=2) cnt++;
        }
        System.out.println(cnt);
    }
}
