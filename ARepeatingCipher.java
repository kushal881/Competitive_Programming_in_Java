import java.util.Scanner;

public class ARepeatingCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String t = scanner.next();

        StringBuilder s = new StringBuilder();
        int currentIndex = 0;
        int step = 1;

        while (currentIndex < n) {
            s.append(t.charAt(currentIndex));
            currentIndex += step;
            step++;
        }

        System.out.println(s.toString());
    }
}