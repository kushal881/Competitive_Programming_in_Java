import java.util.*;
public class AStairPeakorNeither {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(b>a && b<c) System.out.println("STAIR");
            else if(b>a && b>c) System.out.println("PEAK");
            else System.out.println("NONE");
        }
    }
}
