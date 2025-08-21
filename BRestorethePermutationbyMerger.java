import java.util.*;
public class BRestorethePermutationbyMerger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[2*n];
            int[] res = new int[n+1];
            int[] ans = new int[n];
            for(int i=0;i<2*n;i++) arr[i]=sc.nextInt();
            int j=0;
            for(int i=0;i<2*n;i++){
                if(res[arr[i]]==0){
                    ans[j++]=arr[i];
                    res[arr[i]]++;
                }
            }
            for(int i=0;i<n;i++){
                System.out.print(ans[i]+" ");
            }
            System.out.println();
        }
    }
}
