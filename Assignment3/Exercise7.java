package Assignment3;

import java.util.*;

public class Exercise7 {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {
            prefixSum += num;
            int mod = prefixSum % k;

            if (mod < 0) mod += k;

            count += map.getOrDefault(mod, 0);
            map.put(mod, map.getOrDefault(mod, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        Exercise7 solver = new Exercise7();
        int[] nums = {4, 5, 0, -2, -3, 1};
        int k = 5;
        System.out.println(solver.subarraysDivByK(nums, k)); // Output: 7
    }
}
