import java.util.*;
public class APolycarpandtheDayofPi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            String str = sc.next();
            String s = "314159265358979323846264338327";
            int count=0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)!=s.charAt(i)) break;
                else count++;
            }
            System.out.println(count);
        }
    }
}