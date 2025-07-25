package Assignment4;

import java.util.*;

public class Exercise18 {

    public static List<List<String>> allPalindromicPerms(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(String s, int start, List<String> current, List<List<String>> result) {
        if (start == s.length()) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int end = start; end < s.length(); end++) {
            if (isPalindrome(s, start, end)) {
                current.add(s.substring(start, end + 1));
                backtrack(s, end + 1, current, result);
                current.remove(current.size() - 1);
            }
        }
    }

    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right)
            if (s.charAt(left++) != s.charAt(right--)) return false;
        return true;
    }

    public static void main(String[] args) {
        String s = "aab";
        List<List<String>> partitions = allPalindromicPerms(s);

        for (List<String> part : partitions) {
            System.out.println(part);
        }
    }
}

