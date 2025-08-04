import java.util.*;

public class CPrependandAppend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            int start = 0, end = n - 1;
            while (start < end && s.charAt(start) != s.charAt(end)) {
                start++;
                end--;
            }
            System.out.println(end - start + 1);
        }
    }
}
