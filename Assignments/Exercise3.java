package Assignments;
import java.util.*;
public class Exercise3 {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        int i = 0, j = 0;
        ArrayList<Integer> result = new ArrayList<>();

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                if (result.isEmpty() || result.get(result.size() - 1) != a[i]) {
                    result.add(a[i]);
                }
                i++;
            } else if (a[i] > b[j]) {
                if (result.isEmpty() || result.get(result.size() - 1) != b[j]) {
                    result.add(b[j]);
                }
                j++;
            } else {
                if (result.isEmpty() || result.get(result.size() - 1) != a[i]) {
                    result.add(a[i]);
                }
                i++;
                j++;
            }
        }

        while (i < a.length) {
            if (result.isEmpty() || result.get(result.size() - 1) != a[i]) {
                result.add(a[i]);
            }
            i++;
        }

        while (j < b.length) {
            if (result.isEmpty() || result.get(result.size() - 1) != b[j]) {
                result.add(b[j]);
            }
            j++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4};
        int[] b = {2, 3, 5, 5};
        ArrayList<Integer> union = findUnion(a, b);
        for (int num : union) {
            System.out.print(num + " ");
        }
    }
}
