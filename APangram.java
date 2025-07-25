import java.util.*;
public class APangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        String str1 = str.toLowerCase();
        int[] ch = new int[26];
        for(int i=0;i<str.length();i++){
            ch[str1.charAt(i)-'a']++;
        }
        int count=0;
        for (int i=0;i<26;i++){
            if(ch[i]==0) {
                count = 1;
                break;
            }
        }
        if(count==1) System.out.println("NO");
        else System.out.println("YES");
    }
}
