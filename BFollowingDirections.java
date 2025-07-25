import java.util.*;
public class BFollowingDirections {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String str = sc.next();
            int start=0;
            int j=0;
            int count=0;
            for(int i=0;i<n;i++){
                if(str.charAt(i)=='U') j++;
                else if(str.charAt(i)=='D') j--;
                else if(str.charAt(i)=='R') start++;
                else start--;
                if(start==1 && j==1) {
                    System.out.println("YES");
                    count=1;
                    break;
                }
            }
            if(count==0) System.out.println("NO");
        }
    }
}
