import java.util.*;

public class ADubstep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String remix = sc.nextLine();

        // Split the remix by "WUB" and store non-empty parts
        String[] parts = remix.split("WUB");

        StringBuilder original = new StringBuilder();
        for (String word : parts) {
            if (!word.isEmpty()) {
                original.append(word).append(" ");
            }
        }

        // Print the trimmed result (removes the trailing space)
        System.out.println(original.toString().trim());
    }
}
