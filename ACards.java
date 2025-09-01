import java.util.Scanner;

public class ACards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int countOnes = 0;
        int countZeros = 0;

        for (char c : s.toCharArray()) {
            if (c == 'n') {
                countOnes++;
            } else if (c == 'z') {
                countZeros++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < countOnes; i++) {
            sb.append("1 ");
        }
        for (int i = 0; i < countZeros; i++) {
            sb.append("0 ");
        }

        if (sb.length() > 0) {
            System.out.println(sb.toString().trim());
        } else {
            System.out.println();
        }

    }
}