package Assignment4;

import java.util.*;

public class Exercise13 {
    public static int wordBreak(int n, String s, List<String> dictionary) {
        Set<String> wordSet = new HashSet<>(dictionary);
        int len = s.length();
        boolean[] dp = new boolean[len + 1];
        dp[0] = true; // empty string is segmentable

        for (int i = 1; i <= len; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[len] ? 1 : 0;
    }

    public static void main(String[] args) {
        List<String> dictionary = Arrays.asList("leet", "code", "is", "fun");
        String s = "leetcode";
        int n = dictionary.size();

        int result = wordBreak(n, s, dictionary);
        System.out.println(result); // Output: 1
    }
}

