import java.util.*;

public class BDifferentString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            if (allSame(s)) {
                System.out.println("NO");
            } else {
                char[] chars = s.toCharArray();
                Arrays.sort(chars);
                String sorted = new String(chars);
                if (sorted.equals(s)) {
                    reverse(chars);
                    sorted = new String(chars);
                }
                System.out.println("YES");
                System.out.println(sorted);
            }
        }
    }

    static boolean allSame(String s) {
        char first = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != first) return false;
        }
        return true;
    }

    static void reverse(char[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}

