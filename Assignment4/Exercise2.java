package Assignment4;

import java.util.*;

public class Exercise2 {

    public static List<List<String>> groupAnagrams(String[] arr) {
        Map<String, List<String>> map = new LinkedHashMap<>();

        for (String word : arr) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] arr = {"act", "god", "cat", "dog", "tac"};

        List<List<String>> result = groupAnagrams(arr);

        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}

