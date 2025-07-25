package Assignment3;

import java.util.*;

public class Exercise13 {
    public String removeDuplicates(String s, int k) {
        Deque<Pair> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek().ch == c) {
                stack.peek().count++;
                if (stack.peek().count == k) {
                    stack.pop();
                }
            } else {
                stack.push(new Pair(c, 1));
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Pair p : stack) {
            sb.append(String.valueOf(p.ch).repeat(p.count));
        }

        return sb.reverse().toString();
    }

    static class Pair {
        char ch;
        int count;
        Pair(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }

    public static void main(String[] args) {
        Exercise13 remover = new Exercise13();
        String s = "deeedbbcccbdaa";
        int k = 3;
        System.out.println(remover.removeDuplicates(s, k));
    }
}
