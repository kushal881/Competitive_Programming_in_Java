import java.util.*;
public class ABeautifulYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n++;
        int an=-1;
        while(an!=0){
            int cnt=0;
            int a = n;
            Set<Integer> h = new HashSet<>();
            while(a!=0){
                int digit = a%10;
                h.add(digit);
                cnt++;
                a/=10;
            }
            if(cnt==h.size()){
                System.out.println(n);
                an=0;
            }
            else{
                n++;
            }
        }
    }
}
