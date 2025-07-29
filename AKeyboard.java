import java.util.*;

public class AKeyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char direction = sc.next().charAt(0);
        String typed = sc.next();

        String keyboard = "qwertyuiopasdfghjkl;zxcvbnm,./";

        StringBuilder original = new StringBuilder();

        for (char ch : typed.toCharArray()) {
            int idx = keyboard.indexOf(ch);
            if (direction == 'R') {
                original.append(keyboard.charAt(idx - 1));
            } else {
                original.append(keyboard.charAt(idx + 1));
            }
        }

        System.out.println(original.toString());
    }
}
