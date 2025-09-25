import java.util.*;
public class AVasyatheHipster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Math.min(a,b)+" "+(Math.max(a,b)-Math.min(a,b))/2);
    }
}
