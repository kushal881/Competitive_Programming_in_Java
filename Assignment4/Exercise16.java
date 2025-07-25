package Assignment4;

import java.util.*;

public class Exercise16 {

    public static List<String> permuteUnique(String s) {
        List<String> result = new ArrayList<>();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        boolean[] used = new boolean[s.length()];
        backtrack(chars, used, new StringBuilder(), result);
        return result;
    }

    private static void backtrack(char[] chars, boolean[] used, StringBuilder current, List<String> result) {
        if (current.length() == chars.length) {
            result.add(current.toString());
            return;
        }

        for (int i = 0; i < chars.length; i++) {
            if (used[i]) continue;

            if (i > 0 && chars[i] == chars[i - 1] && !used[i - 1]) continue;

            used[i] = true;
            current.append(chars[i]);
            backtrack(chars, used, current, result);
            current.deleteCharAt(current.length() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        String s = "AAB";
        List<String> uniquePermutations = permuteUnique(s);
        for (String perm : uniquePermutations) {
            System.out.println(perm);
        }
    }
}

