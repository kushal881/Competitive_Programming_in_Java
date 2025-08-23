import java.util.*;
public class BChoosingCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int f = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            int fav = arr[f-1];
            Arrays.sort(arr);
            for (int i = 0; i < arr.length / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = temp;
            }
            int[] res = new int[arr[0]+1];
            for(int i=0;i<n;i++){
                res[arr[i]]++;
            }
            int c=0;
            int s=0;
            if(res[fav]>1) {
                for (int i = 0; i < k; i++) {
                    if (fav==arr[i]) c++;
                }
                if(c==res[fav]) {
                    System.out.println("YES");
                    s=1;
                }
            }
            if(s==0) {
                for (int i = 0; i < k; i++) {
                    if (fav == arr[i] && res[fav] > 1 && s == 0) {
                        System.out.println("MAYBE");
                        s = 1;
                    } else if (fav == arr[i] && s == 0) {
                        System.out.println("YES");
                        s = 1;
                    }
                }
            }
            if(s==0) System.out.println("NO");
            }
        }
    }
