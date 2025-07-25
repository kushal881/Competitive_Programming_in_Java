package Assignment4;

public class Exercise1 {

    public static int transform(String A, String B) {
        if (A.length() != B.length()) return -1;

        int[] count = new int[256];

        for (int i = 0; i < A.length(); i++) {
            count[A.charAt(i)]++;
            count[B.charAt(i)]--;
        }

        for (int i = 0; i < 256; i++) {
            if (count[i] != 0)
                return -1;
        }

        int i = A.length() - 1;
        int j = B.length() - 1;

        while (i >= 0) {
            if (A.charAt(i) == B.charAt(j)) {
                j--;
            }
            i--;
        }

        return j + 1;
    }

    public static void main(String[] args) {
        String A1 = "EACBD";
        String B1 = "EABCD";
        System.out.println("Minimum steps: " + transform(A1, B1));

        String A2 = "abcdef";
        String B2 = "defabc";
        System.out.println("Minimum steps: " + transform(A2, B2));

        String A3 = "abc";
        String B3 = "def";
        System.out.println("Minimum steps: " + transform(A3, B3));
    }
}
