import java.util.*;
public class BTenWordsofWisdom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int max=0;
            int res=0;
            int ans=0;
            while(n-- > 0){
                int a = sc.nextInt();
                int b = sc.nextInt();
                res++;
                if(a<= 10 && b>max){
                    max=b;
                    ans=res;
                }
            }
            System.out.println(ans);
        }
    }
}
