import java.util.*;
public class AMusicalPuzzle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            Set<String> h = new HashSet<>();
            int l=0;
            int r=1;
            while(r<n){
                String str="";
                str+=s.charAt(l);
                str+=s.charAt(r);
                h.add(str);
                l++;
                r++;
            }
            System.out.println(h.size());
        }
    }
}
