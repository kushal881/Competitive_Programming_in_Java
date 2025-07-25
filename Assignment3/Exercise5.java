package Assignment3;

public class Exercise5 {
    public long countSubarrays(int[] nums) {
        long count = 0;
        int n = nums.length;

        int i = 0;
        while (i < n) {
            int start = i;
            int max = nums[i];

            while (i < n && nums[i] <= max) {
                max = Math.max(max, nums[i]);
                i++;
            }

            // Now process the segment from start to i - 1
            int j = start;
            while (j < i) {
                if (nums[j] == max) {
                    int k = j + 1;
                    while (k < i && nums[k] <= max) k++;

                    long len = k - j;
                    count += len;

                    j = k;
                } else {
                    j++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Exercise5 ms = new Exercise5();
        int[] nums = {1, 3, 3, 3, 2};
        System.out.println(ms.countSubarrays(nums));
    }
}

