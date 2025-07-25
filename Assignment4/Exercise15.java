package Assignment4;

public class Exercise15 {

    public static long smallestSubarraySum(int[] arr, int N) {
        long minEndingHere = arr[0];
        long minSoFar = arr[0];

        for (int i = 1; i < N; i++) {
            minEndingHere = Math.min(arr[i], minEndingHere + arr[i]);
            minSoFar = Math.min(minSoFar, minEndingHere);
        }

        return minSoFar;
    }

    public static void main(String[] args) {
        int[] arr = {3, -4, 2, -3, -1, 7, -5};
        int N = arr.length;
        System.out.println("Minimum subarray sum is: " + smallestSubarraySum(arr, N));
    }
}

