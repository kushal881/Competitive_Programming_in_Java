import java.util.*;
public class ADrTC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            String str = sc.next();
            int zero=0;
            int one=0;
            for(int i=0;i<n;i++){
                if(str.charAt(i)=='1'){
                    one++;
                }
                else{
                    zero++;
                }
            }
            System.out.println(one * (n - 1) + zero);
        }
    }
}
