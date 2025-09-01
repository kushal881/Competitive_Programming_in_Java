import java.util.*;
public class AMakeAllEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            HashMap<Integer,Integer> freq = new HashMap<>();
            for (int x : a) freq.put(x, freq.getOrDefault(x,0)+1);
            int maxFreq = 0;
            for (int v : freq.values()) maxFreq = Math.max(maxFreq,v);
            System.out.println(n - maxFreq);
        }
    }
}
