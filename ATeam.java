import java.util.*;
public class ATeam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int an = 0;
        while(t-- > 0){
            int[] arr = new int[3];
            int cnt=0;
            for(int i=0;i<3;i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 1) cnt++;
            }
            if(cnt>1) an++;
        }
        System.out.println(an);
    }
}
