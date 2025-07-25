package Strings;
import java.util.*;

public class StringBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Kushal";
        String gtr = "Kamboj";
//        String s = sc.next();
//        String a = sc.nextLine();
//        System.out.println(s);
//        System.out.println(a);
//        System.out.println(str);
//        char ch = str.charAt(3);
//        int i = str.indexOf('l');
//        System.out.println(ch);
//        System.out.println(i);
        System.out.println(str.compareTo(gtr));
        System.out.println(str.contains("ha"));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.concat(gtr));
    }
}
