import java.util.*;
public class AColorfulStonesSimplifiedEdition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int first=0;
        int second=0;
        while(second<s2.length()){
            if(s1.charAt(first)==s2.charAt(second)) first++;
            second++;
        }
        System.out.println(first+1);
    }
}
