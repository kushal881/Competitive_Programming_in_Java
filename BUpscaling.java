import java.util.Scanner;

public class BUpscaling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int size = 2 * n;

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    int blockRow = i / 2;
                    int blockCol = j / 2;
                    if ((blockRow + blockCol) % 2 == 0)
                        System.out.print('#');
                    else
                        System.out.print('.');
                }
                System.out.println();
            }
        }
    }
}
