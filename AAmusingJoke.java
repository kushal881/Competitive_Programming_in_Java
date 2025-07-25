import java.util.*;
public class AAmusingJoke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String str = sc.next();
        String str1 = s1+s2;
        int[] ch = new int[26];
        int[] ch1 = new int[26];
        for(int i=0;i<str1.length();i++){
            ch[str1.charAt(i)-'A']++;
        }
        for(int i=0;i<str.length();i++){
            ch1[str.charAt(i)-'A']++;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(ch[i]!=ch1[i]){
                count=1;
                System.out.println("NO");
                break;
            }
        }
        if(count==0) System.out.println("YES");
    }
}
