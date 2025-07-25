import java.util.Scanner;

public class BQueueattheSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String s = sc.next();

        char[] queue = s.toCharArray();

        while (t-- > 0) {
            for (int i = 0; i < queue.length - 1; i++) {
                if (queue[i] == 'B' && queue[i + 1] == 'G') {
                    char temp = queue[i];
                    queue[i] = queue[i + 1];
                    queue[i + 1] = temp;
                    i++;
                }
            }
        }

        System.out.println(new String(queue));
    }
}
