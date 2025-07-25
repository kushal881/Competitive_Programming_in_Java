package Assignment3;


import java.util.*;

public class Exercise10 {
    public static String firstNonRepeating(String s) {
        int[] freq = new int[26];
        Queue<Character> q = new LinkedList<>();
        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
            q.offer(ch);

            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.poll();
            }

            if (!q.isEmpty()) {
                result.append(q.peek());
            } else {
                result.append('#');
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "aabc";
        System.out.println(firstNonRepeating(s));
    }
}
