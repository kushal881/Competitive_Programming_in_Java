package Assignment3;

import java.util.*;

public class Exercise6 {
    public static int countEqual012(String str) {
        int count0 = 0, count1 = 0, count2 = 0;
        Map<String, Integer> map = new HashMap<>();
        map.put("0#0", 1);  // base case: empty prefix

        int result = 0;

        for (char ch : str.toCharArray()) {
            if (ch == '0') count0++;
            else if (ch == '1') count1++;
            else count2++;

            int diff10 = count1 - count0;
            int diff21 = count2 - count1;

            String key = diff10 + "#" + diff21;
            result += map.getOrDefault(key, 0);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "0102010";
        System.out.println(countEqual012(str));  // Output: 2
    }
}

