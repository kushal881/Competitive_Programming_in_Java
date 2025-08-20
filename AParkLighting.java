import java.util.*;
public class AParkLighting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long m = sc.nextLong();

            long totalCells = n * m;
            long lanterns = (totalCells + 1) / 2;

            System.out.println(lanterns);
        }
    }
}
