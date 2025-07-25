import java.util.*;
public class AWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count=0;
        for(int i=0;i<str.length();i++){
            int ch = str.charAt(i);
            if(ch>=65 && ch<=91) count++;
        }
        if(count>str.length()/2) System.out.println(str.toUpperCase());
        else System.out.println(str.toLowerCase());
    }
}
