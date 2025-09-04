import java.util.*;
public class AXAxis {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int[] arr = {a,b,c};
            Arrays.sort(arr);
            int d = arr[1];
            System.out.println(Math.abs(a-d)+Math.abs(b-d)+Math.abs(c-d));
        }
    }
}
