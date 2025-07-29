import java.util.*;
public class BAtillasFavoriteProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            int max = s.charAt(0) - 'a';
            for(int i=0;i<n;i++){
                if(max<s.charAt(i)-'a') max = s.charAt(i)-'a';
            }
            System.out.println(max+1);
        }
    }
}
