import java.util.*;
public class AGames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i=0;i<n;i++){
                arr[i][0] = sc.nextInt();
                arr[i][1] = sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i][0] == arr[j][1]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
