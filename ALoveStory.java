import java.util.*;
public class ALoveStory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0){
            String str = "codeforces";
            String str1 = sc.next();
            int first=0;
            int second=0;
            int count=0;
            while(first<str.length()){
                if(str.charAt(first)!=str1.charAt(second)) count++;
                first++;
                second++;
            }
            System.out.println(count);
            n--;
        }
    }
}
