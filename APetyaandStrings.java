import java.util.*;

public class APetyaandStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        String s1 = str1.toLowerCase();
        String s2 = str2.toLowerCase();

        int result = s1.compareTo(s2);
        if(result < 0) {
            System.out.println(-1);
        } else if(result > 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
