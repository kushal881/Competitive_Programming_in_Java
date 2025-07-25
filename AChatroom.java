import java.util.Scanner;

public class AChatroom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String target = "hello";
        int j = 0; // Pointer for 'hello'

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target.charAt(j)) {
                j++;
                if (j == target.length()) {
                    break; // All characters of "hello" found in order
                }
            }
        }

        if (j == target.length()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
