import java.util.*;
public class BIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            Set<Integer> st = new HashSet<>();
            for(int i=0;i<n;i++) {
                arr[i] = sc.nextInt();
                st.add(arr[i]);
            }
            if(arr.length==st.size()) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
