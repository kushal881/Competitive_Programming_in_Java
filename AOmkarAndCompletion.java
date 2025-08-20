import java.util.*;
public class AOmkarAndCompletion{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int a = n/2;
            if(a==0) System.out.print(1);
            else{
                for(int i=0;i<n;i++){
                    System.out.print(a+" ");
                }
            }
            System.out.println();
        }
    }
}