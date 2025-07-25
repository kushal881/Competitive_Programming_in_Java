import java.util.*;
public class AStringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String s1=str.toLowerCase();

        for(int i=0;i<str.length();i++){
            char ch = s1.charAt(i);
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' && ch!='y'){
                System.out.print('.');
                System.out.print(ch);
            }
        }
    }
}
