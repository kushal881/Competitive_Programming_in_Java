import java.util.*;
public class ABoyorGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Set<Character> h = new HashSet<>();
        for(int i=0;i<s.length();i++){
            h.add(s.charAt(i));
        }
        if(h.size()%2==0) System.out.println("CHAT WITH HER!");
        else System.out.println("IGNORE HIM!");
    }
}
