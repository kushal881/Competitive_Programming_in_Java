package Assignment2;

public class Exercise11 {
    public static int searchInStepArray(int[] arr, int k, int x) {
        int n = arr.length;
        int i = 0;

        while (i < n) {
            if (arr[i] == x) return i;

            int jump = Math.max(1, Math.abs(arr[i] - x) / k);
            i += jump;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 9};
        int k = 1;
        int x = 7;
        System.out.println(searchInStepArray(arr, k, x));
    }
}

