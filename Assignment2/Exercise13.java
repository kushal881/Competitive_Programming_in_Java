package Assignment2;

public class Exercise13 {
    public static int isPresentInAP(int a, int c, int b) {
        if (c == 0) {
            return a == b ? 1 : 0;
        }

        int diff = b - a;
        if (diff % c != 0) return 0;

        int n = diff / c + 1;
        return n >= 1 ? 1 : 0;
    }

    public static void main(String[] args) {
        int a = 2, c = 3, b = 11;
        System.out.println(isPresentInAP(a, c, b));

        a = 2; c = 3; b = 10;
        System.out.println(isPresentInAP(a, c, b));
    }
}

