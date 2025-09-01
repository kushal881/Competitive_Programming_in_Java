import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ABustoUdayland{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<String> busLayout = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            busLayout.add(br.readLine());
        }

        boolean foundSpot = false;

        for (int i = 0; i < n; i++) {
            String row = busLayout.get(i);
            if (row.charAt(0) == 'O' && row.charAt(1) == 'O') {
                busLayout.set(i, "++|" + row.substring(3));
                foundSpot = true;
                break;
            }
            if (row.charAt(3) == 'O' && row.charAt(4) == 'O') {
                busLayout.set(i, row.substring(0, 3) + "++");
                foundSpot = true;
                break;
            }
        }

        if (foundSpot) {
            System.out.println("YES");
            for (String row : busLayout) {
                System.out.println(row);
            }
        } else {
            System.out.println("NO");
        }
    }
}