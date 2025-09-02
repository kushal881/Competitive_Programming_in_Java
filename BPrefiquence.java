import java.util.*;
public class BPrefiquence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            String s1 = sc.next();
            String s2 = sc.next();
            int max = 0;
            int first=0;
            int second=0;
            while(first<s1.length() && second<s2.length()){
                if(s1.charAt(first)==s2.charAt(second)){
                    max++;
                    first++;
                }
                second++;
            }
            System.out.println(max);
        }
    }
}
