import java.util.*;
public class AWordCapitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String a = Character.toUpperCase(s.charAt(0)) + s.substring(1);
        System.out.println(a);
    }
}
