import java.util.*;
public class APrimaryTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String str = sc.next();
            if(str.length()<3) System.out.println("NO");
            else if(str.charAt(0)!='1' || str.charAt(1)!='0') System.out.println("NO");
            else{
                if(str.charAt(2)=='0') System.out.println("NO");
                else{
                    if(str.length()>3) System.out.println("YES");
                    else{
                        if(str.charAt(2)!='1') System.out.println("YES");
                        else System.out.println("NO");
                    }
                }
            }
        }
    }
}
