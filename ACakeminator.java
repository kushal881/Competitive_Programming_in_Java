import java.util.Scanner;

public class ACakeminator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.nextLine();

        boolean[] rowHasStrawberry = new boolean[r];
        boolean[] colHasStrawberry = new boolean[c];

        for (int i = 0; i < r; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < c; j++) {
                if (line.charAt(j) == 'S') {
                    rowHasStrawberry[i] = true;
                    colHasStrawberry[j] = true;
                }
            }
        }

        int safeRows = 0;
        for (int i = 0; i < r; i++) {
            if (rowHasStrawberry[i]) {
                safeRows++;
            }
        }

        int safeCols = 0;
        for (int j = 0; j < c; j++) {
            if (colHasStrawberry[j]) {
                safeCols++;
            }
        }

        int uneatenCells = safeRows * safeCols;
        int totalCells = r * c;
        int eatenCells = totalCells - uneatenCells;

        System.out.println(eatenCells);
    }
}