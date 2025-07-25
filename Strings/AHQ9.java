package Strings;
import java.util.*;
public class AHQ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p = sc.next();
        int n=0;
        int count=0;
        while(n<p.length()){
            char ch = p.charAt(n);
            if(ch=='H' || ch=='Q' || ch=='9' ){
                System.out.println("YES");
                count=1;
                break;
            }
            n++;
        }
        if(count==0) System.out.println("NO");
    }
}
