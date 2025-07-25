import java.util.Scanner;

public class ASerejaandDima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] cards = new int[n];

        for (int i = 0; i < n; i++) {
            cards[i] = sc.nextInt();
        }

        int sereja = 0, dima = 0;
        int left = 0, right = n - 1;
        boolean serejasTurn = true;

        while (left <= right) {
            int chosenCard;
            if (cards[left] > cards[right]) {
                chosenCard = cards[left];
                left++;
            } else {
                chosenCard = cards[right];
                right--;
            }

            if (serejasTurn) {
                sereja += chosenCard;
            } else {
                dima += chosenCard;
            }

            serejasTurn = !serejasTurn;
        }

        System.out.println(sereja + " " + dima);
    }
}
