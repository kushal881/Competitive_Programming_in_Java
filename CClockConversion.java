import java.util.*;

public class CClockConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            String s = sc.nextLine();
            String[] parts = s.split(":");
            int hh = Integer.parseInt(parts[0]);
            String mm = parts[1];
            String period;

            int convertedHour;
            if (hh == 0) {
                convertedHour = 12;
                period = "AM";
            } else if (hh == 12) {
                convertedHour = 12;
                period = "PM";
            } else if (hh < 12) {
                convertedHour = hh;
                period = "AM";
            } else {
                convertedHour = hh - 12;
                period = "PM";
            }

            String hourStr = String.format("%02d", convertedHour);

            System.out.println(hourStr + ":" + mm + " " + period);
        }
    }
}
