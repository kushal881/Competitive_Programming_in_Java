import java.util.*;

public class AMakeitBeautiful {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

            boolean allSame = true;
            for (int i = 1; i < n; i++) {
                if (arr[i] != arr[0]) {
                    allSame = false;
                    break;
                }
            }

            if (allSame) {
                System.out.println("NO");
                continue;
            }

            Arrays.sort(arr);
            reverse(arr);

            int sum = 0;
            boolean ugly = false;
            for (int i = 0; i < n; i++) {
                if (arr[i] == sum) {
                    ugly = true;
                    break;
                }
                sum += arr[i];
            }

            if (!ugly) {
                System.out.println("YES");
                for (int num : arr) System.out.print(num + " ");
                System.out.println();
            } else {
                int temp = arr[0];
                for (int i = 0; i < n - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[n - 1] = temp;

                sum = 0;
                ugly = false;
                for (int i = 0; i < n; i++) {
                    if (arr[i] == sum) {
                        ugly = true;
                        break;
                    }
                    sum += arr[i];
                }

                if (!ugly) {
                    System.out.println("YES");
                    for (int num : arr) System.out.print(num + " ");
                    System.out.println();
                } else {
                    System.out.println("NO");
                }
            }
        }
    }

    static void reverse(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}
