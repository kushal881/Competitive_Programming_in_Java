import java.util.*;
public class ASquareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String str = sc.next();
            int first=0;
            int second = str.length()/2;
            int count=0;
            if(str.length()%2!=0) {
                System.out.println("NO");
                count = 1;
            }
            else {
                while (second < str.length()) {
                    if (str.charAt(first) != str.charAt(second)) {
                        System.out.println("NO");
                        count = 1;
                        break;
                    }
                    first++;
                    second++;
                }
            }
            if(count==0) System.out.println("YES");
        }
    }
}
