import java.util.*;
public class ABlackSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for(int i=0;i<4;i++){
            arr[i]=sc.nextInt();
        }
        String str = sc.next();
        int sum=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='1') sum+=arr[0];
            if(ch=='2') sum+=arr[1];
            if(ch=='3') sum+=arr[2];
            if(ch=='4') sum+=arr[3];
        }
        System.out.println(sum);
    }
}
