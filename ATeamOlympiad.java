import java.util.*;

public class ATeamOlympiad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> prog = new ArrayList<>();
        List<Integer> math = new ArrayList<>();
        List<Integer> pe = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            int t = sc.nextInt();
            if (t == 1) prog.add(i);
            else if (t == 2) math.add(i);
            else if (t == 3) pe.add(i);
        }

        int teams = Math.min(prog.size(), Math.min(math.size(), pe.size()));
        System.out.println(teams);

        for (int i = 0; i < teams; i++) {
            System.out.println(prog.get(i) + " " + math.get(i) + " " + pe.get(i));
        }
    }
}
