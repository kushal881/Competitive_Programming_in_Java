
import java.util.*;
public class BFileName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int count = 0;
        int ans =0 ;
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='x') count++;
            else if(str.charAt(i)!='x' && count>=3){
                ans=ans + count-2;
                count=0;
            }
            else if(str.charAt(i)!='x'){
                count=0;
            }
        }
        if(count==str.length()) System.out.println(count-2);
        else if(count>=3) System.out.println(ans+count-2);
        else System.out.println(ans);
    }
}
