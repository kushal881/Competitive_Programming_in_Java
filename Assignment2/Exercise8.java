package Assignment2;

import java.util.*;

public class Exercise8 {
    public static int countSetBits(int n) {
        return Integer.bitCount(n);
    }

    public static void sortBySetBitCount(Integer[] arr) {
        Arrays.sort(arr, (a, b) -> {
            int countA = countSetBits(a);
            int countB = countSetBits(b);
            return countB - countA;
        });
    }

    public static void main(String[] args) {
        Integer[] arr = {5, 3, 7, 10, 14};
        sortBySetBitCount(arr);
        System.out.println(Arrays.toString(arr));
    }
}
