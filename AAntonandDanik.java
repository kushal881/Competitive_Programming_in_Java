import java.util.*;
public class AAntonandDanik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int count1=0;
        int count2=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='A') count1++;
            else count2++;
        }
        if(count1>count2) System.out.println("Anton");
        else if(count1<count2) System.out.println("Danik");
        else System.out.println("Friendship");
    }
}
