import java.util.Scanner;

public class BEvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i]=sc.nextInt();

            int oddWrong = 0;
            int evenWrong = 0;

            for(int i = 0; i < n; i++) {
                if (i % 2 != arr[i] % 2) {
                    if (i % 2 == 0) evenWrong++;
                    else oddWrong++;
                }
            }

            if (oddWrong == evenWrong) {
                System.out.println(oddWrong);
            } else {
                System.out.println(-1);
            }
        }
    }
}
