import java.util.*;
public class BColourblindness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String str1 = sc.next();
            String str2 = sc.next();
            int first = 0;
            int second=0;
            while(second<str1.length()){
                if(str1.charAt(first)==str2.charAt(second)){
                    first++;
                    second++;
                }
                else if(str1.charAt(first)=='B' && str2.charAt(second)=='G'){
                    first++;
                    second++;
                }
                else if(str1.charAt(first)=='G' && str2.charAt(second)=='B'){
                    first++;
                    second++;
                }
                else {
                    System.out.println("NO");
                    break;
                }
            }
            if(second==str1.length()) System.out.println("YES");
        }
    }
}
