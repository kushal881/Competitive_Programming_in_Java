import java.util.Scanner;

public class AVanyaandCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int height = 0;
        int cubesUsed = 0;
        for (int i = 1; ; i++) {
            int needed = i * (i + 1) / 2;
            if (cubesUsed + needed > n) {
                break;
            }
            cubesUsed += needed;
            height++;
        }
        System.out.println(height);
    }
}
