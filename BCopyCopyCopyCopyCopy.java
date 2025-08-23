import java.util.*;
public class BCopyCopyCopyCopyCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            Set<Integer> h = new HashSet<>();
            for(int i=0;i<n;i++){
                int a = sc.nextInt();
                h.add(a);
            }
            System.out.println(h.size());
        }
    }
}
