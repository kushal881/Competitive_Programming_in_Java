import java.util.*;
public class ACipherShifer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            String a  = "";
            int l=0;
            int r=1;
            while(r<n){
                if(s.charAt(l)!=s.charAt(r)){
                    r++;
                }
                else{
                    a+=s.charAt(l);
                    l=r+1;
                    r+=2;
                }
            }
            System.out.println(a);
        }
    }
}
