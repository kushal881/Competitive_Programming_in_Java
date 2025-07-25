package Assignment3;

import java.util.*;

public class Exercise9 {
    public static List<List<String>> groupShiftedStrings(String[] arr) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : arr) {
            String key = getShiftPattern(s);
            map.computeIfAbsent(key, x -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }

    private static String getShiftPattern(String s) {
        StringBuilder pattern = new StringBuilder();
        int base = s.charAt(0) - 'a';

        for (char c : s.toCharArray()) {
            int diff = (c - base + 26) % 26;
            pattern.append(diff).append('_');
        }

        return pattern.toString();
    }

    public static void main(String[] args) {
        String[] arr = {"abc", "bcd", "xyz", "yza", "acef", "bdfg"};
        List<List<String>> result = groupShiftedStrings(arr);

        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}

