import java.util.*;
public class ADontTrytoCount {
    public static int[] computeLPS(String s){
        int[] lps = new int[s.length()];
        int first =0;
        int second =1;
        while(second<s.length()){
            if(s.charAt(first)==s.charAt(second)){
                lps[second]=first+1;
                first++;
                second++;
            }
            else{
                if(first==0){
                    lps[second]=0;
                    second++;
                }
                else{
                    first=lps[first-1];
                }
            }
        }
        return lps;
    }
    public static boolean check(int[] lps ,String x , String s){
        int n = x.length();
        int m = s.length();
        int first=0;
        int second =0;
        while(first<n && second<m){
            if(x.charAt(first)==s.charAt(second)){
                first++;
                second++;
            }
            else{
                if(second==0){
                    first++;
                }
                else{
                    second=lps[second-1];
                }
            }
        }
        return second == m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n =  sc.nextInt();
            int m = sc.nextInt();
            String x = sc.next();
            String s = sc.next();
            int[] lps = computeLPS(s);
            int count=0;
            if(n>m){
                boolean a = check(lps,x,s);
                if(!a){
                    x+=x;
                    count=1;
                    a=check(lps,x,s);
                }
                if(!a){
                    System.out.println(-1);
                }
                else{
                    System.out.println(count);
                }
            }
            else{
                while(n<m){
                    count++;
                    x+=x;
                    n=x.length();
                }
                boolean a = check(lps,x,s);
                if(!a){
                    count++;
                    x+=x;
                    a=check(lps,x,s);
                    if(!a) System.out.println(-1);
                    else System.out.println(count);
                }
                else{
                    System.out.println(count);
                }
            }
        }
    }
}
