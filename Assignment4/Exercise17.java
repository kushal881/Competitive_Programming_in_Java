package Assignment4;

import java.util.*;

public class Exercise17 {

    public static List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        backtrack(arr, target, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] arr, int target, int index, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            if (arr[i] > target) break;

            current.add(arr[i]);
            backtrack(arr, target - arr[i], i, current, result);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> combinations = combinationSum(arr, target);
        for (List<Integer> list : combinations) {
            System.out.println(list);
        }
    }
}

