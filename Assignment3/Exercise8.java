package Assignment3;

import java.util.*;

public class Exercise8 {
    public static List<Integer> maxSlidingWindow(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.pollLast();
            }

            dq.offerLast(i);

            if (i >= k - 1) {
                result.add(arr[dq.peekFirst()]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 1, 2, 0, 5};
        int k = 3;
        System.out.println(maxSlidingWindow(arr, k));
    }
}

