import java.util.*;
public class AHulk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            if(i%2==0 && i==n-1) System.out.print("I hate it");
            else if (i%2!=0 && i==n-1) {
                System.out.print("I love it");
            } else if (i%2==0) {
                System.out.print("I hate that ");
            }
            else {
                System.out.print("I love that ");
            }
        }
    }
}
