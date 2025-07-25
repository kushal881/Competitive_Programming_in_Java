import java.util.*;

public class ATram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Number of stops
        int currentPassengers = 0; // Number of passengers currently in the tram
        int maxPassengers = 0;     // Maximum number of passengers observed

        for (int i = 0; i < n; i++) {
            int exit = sc.nextInt(); // Number of passengers exiting
            int enter = sc.nextInt(); // Number of passengers entering

            currentPassengers -= exit;
            currentPassengers += enter;

            // Update maximum capacity if current is more than max so far
            if (currentPassengers > maxPassengers) {
                maxPassengers = currentPassengers;
            }
        }

        System.out.println(maxPassengers);
    }
}
