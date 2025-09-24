import java.util.*;
public class AYESorYES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            String s = sc.next();
            String a = s.toLowerCase();
            if(a.equals("yes")){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}
