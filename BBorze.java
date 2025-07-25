import java.util.*;
public class BBorze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int i=0;
        while(i<str.length()){
            if(str.charAt(i)=='-' && str.charAt(i+1)=='.'){
                System.out.print(1);
                i=i+2;
            }
            else if(str.charAt(i)=='-' && str.charAt(i+1)=='-'){
                System.out.print(2);
                i=i+2;
            }
            else{
                System.out.print(0);
                i++;
            }
        }
    }
}
