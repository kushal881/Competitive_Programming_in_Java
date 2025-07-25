import java.util.*;
public class AElections {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b =sc.nextInt();
            int c = sc.nextInt();
            int A  = Math.max(b,c) - a+1;
            int B = Math.max(a,c) - b +1;
            int C = Math.max(a,b) - c +1;
            if(a>Math.max(b,c)) System.out.print(0+" ");
            else System.out.print(A+" ");
            if(b>Math.max(a,c)) System.out.print(0+" ");
            else System.out.print(B+" ");
            if(c>Math.max(a,b)) System.out.print(0+" ");
            else System.out.println(C+" ");
        }
    }
}
