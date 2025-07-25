package Assignment2;

public class Exercise4 {
    public static boolean isPossible(int[] arr, int k, int maxPages) {
        int studentCount = 1, pagesSum = 0;
        for (int pages : arr) {
            if (pages > maxPages) return false;
            if (pagesSum + pages > maxPages) {
                studentCount++;
                pagesSum = pages;
            } else {
                pagesSum += pages;
            }
        }
        return studentCount <= k;
    }

    public static int findMinimumPages(int[] arr, int k) {
        if (arr.length < k) return -1;

        int low = arr[0], high = 0;
        for (int pages : arr) {
            low = Math.max(low, pages);
            high += pages;
        }

        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(arr, k, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] books = {12, 34, 67, 90};
        int students = 2;
        System.out.println(findMinimumPages(books, students));
    }
}
