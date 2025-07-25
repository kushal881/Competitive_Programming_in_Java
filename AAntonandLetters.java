import java.util.*;
public class AAntonandLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Set<Character> ch = new HashSet<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='{'){
                if(str.charAt(i)!=','){
                    if(str.charAt(i)!='}' && str.charAt(i)!=' '){
                        ch.add(str.charAt(i));
                    }
                }
            }
        }
        System.out.println(ch.size());
    }
}
