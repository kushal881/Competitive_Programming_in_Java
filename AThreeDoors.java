import java.util.Scanner;

public class AThreeDoors{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            solve(scanner);
        }
    }

    private static void solve(Scanner scanner) {
        int x = scanner.nextInt();
        int[] doors = new int[4];
        doors[1] = scanner.nextInt();
        doors[2] = scanner.nextInt();
        doors[3] = scanner.nextInt();

        int keyBehindFirstDoor = doors[x];
        if (keyBehindFirstDoor == 0) {
            System.out.println("NO");
            return;
        }

        int keyBehindSecondDoor = doors[keyBehindFirstDoor];
        if (keyBehindSecondDoor == 0) {
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
    }
}