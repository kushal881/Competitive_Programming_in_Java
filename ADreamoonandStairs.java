import java.util.*;
public class ADreamoonandStairs {
    public static int countSteps(int n,int m){
        if(m>n) return -1;
        if(n==m) return n;
        int steps = n/2;
        int a=steps+1;
        if(n%2==0) {
            while (steps < n) {
                if (steps % m == 0) return steps;
                steps++;
            }
        }
        else{
            while (a< n) {
                if (a % m == 0) return a;
                a++;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m  = sc.nextInt();
        System.out.println(countSteps(n,m));
    }
}
