package Assignment3;


import java.util.*;

public class Exercise3 {
    public int totalSteps(int[] nums) {
        int n = nums.length;
        int res = 0;
        Stack<int[]> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            int steps = 0;
            while (!stack.isEmpty() && nums[i] >= stack.peek()[0]) {
                steps = Math.max(steps, stack.pop()[1]);
            }
            steps = stack.isEmpty() ? 0 : steps + 1;
            res = Math.max(res, steps);
            stack.push(new int[]{nums[i], steps});
        }

        return res;
    }

    public static void main(String[] args) {
        Exercise3 nds = new Exercise3();
        int[] nums = {5, 3, 4, 4, 7, 3, 6, 11, 8, 5, 11};
        System.out.println(nds.totalSteps(nums));
    }
}

