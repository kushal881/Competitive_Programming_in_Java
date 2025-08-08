import java.util.*;

public class ALinearKeyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            String keyboard = sc.nextLine();
            String word = sc.nextLine();

            int[] pos = new int[26];
            for (int i = 0; i < 26; i++) {
                pos[keyboard.charAt(i) - 'a'] = i;
            }

            int time = 0;
            for (int i = 1; i < word.length(); i++) {
                int prev = pos[word.charAt(i - 1) - 'a'];
                int curr = pos[word.charAt(i) - 'a'];
                time += Math.abs(curr - prev);
            }

            System.out.println(time);
        }

    }
}
