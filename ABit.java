import java.util.*;
public class ABit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int cnt=0;
        while(t-- > 0){
            String s = sc.next();
            if(s.equals("++X") || s.equals("X++")) cnt++;
            else cnt--;
        }
        System.out.println(cnt);
    }
}
