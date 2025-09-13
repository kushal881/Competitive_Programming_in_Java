import java.util.Scanner;

public class AMezoPlayingZoma{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();

        int countL = 0;
        int countR = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'L') {
                countL++;
            } else {
                countR++;
            }
        }

        System.out.println(n + 1);

    }
}