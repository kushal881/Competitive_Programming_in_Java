import java.util.*;
public class AFootball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i=0;i<n;i++){
            str[i] = sc.next();
        }
        int count1=0;
        int count2=0;
        String str2="";
        if(str.length==1) {
            System.out.println(str[0]);
            return;
        }
        for(int i=0;i<n;i++){
            if(str[0].equals(str[i])) count1++;
            else if(count2==0){
                str2 += str[i];
                count2=1;
            }
        }
        count2=0;
        for(int i=0;i<n;i++){
            if(str2.equals(str[i])) count2++;
        }
        if(count1>count2) System.out.println(str[0]);
        else System.out.println(str2);
    }
}
