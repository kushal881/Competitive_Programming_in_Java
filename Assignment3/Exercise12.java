package Assignment3;

public class Exercise12{
    public long subArrayRanges(int[] nums) {
        long total = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int minVal = nums[i];
            int maxVal = nums[i];
            for (int j = i; j < n; j++) {
                minVal = Math.min(minVal, nums[j]);
                maxVal = Math.max(maxVal, nums[j]);
                total += maxVal - minVal;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        Exercise12 solver = new Exercise12();
        int[] nums = {1, 2, 3};
        System.out.println(solver.subArrayRanges(nums));
    }
}
