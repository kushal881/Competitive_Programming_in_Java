import java.util.*;
public class AVladandtheBestofFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        while (t--  >0){
            String s = sc.next();
            int c1 = 0;
            int c2 = 0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='A') c1++;
                else c2++;
            }
            System.out.println(c1>c2?'A':'B');
        }
    }
}
