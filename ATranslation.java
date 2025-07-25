

import java.util.*;
public class ATranslation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String reversed = new StringBuilder(str1).reverse().toString();
        if(reversed.equals(str2)) System.out.println("YES");
        else System.out.println("NO");
    }
}
