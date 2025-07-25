import java.util.*;
public class BNormalProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String a = sc.next();
            String b = "";
            for(int i=a.length()-1;i>=0;i--){
                if(a.charAt(i)=='p') b+='q';
                else if(a.charAt(i)=='q') b+='p';
                else b+='w';
            }
            System.out.println(b);
        }
    }
}
