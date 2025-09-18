import java.util.*;
public class AInSearchofanEasyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt=0;
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            if(a==1){
                cnt=1;
                break;
            }
        }
        if(cnt==0) System.out.println("EASY");
        else System.out.println("HARD");
    }
}
