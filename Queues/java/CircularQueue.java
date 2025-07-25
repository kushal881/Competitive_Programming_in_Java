package Queues.java;

public class CircularQueue {
    public static class Cqueue {
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new int[8];

        public void add(int x) {
            if (size == arr.length) {
                System.out.println("Queue is full!");
                return;
            } else if (size == 0) {
                f = r = 0;
                arr[0] = x;
            } else if (r < arr.length - 1) {
                arr[++r] = x;
            } else if (r == arr.length - 1) {
                r = 0;
                arr[0] = x;
            }
            size++;
        }

        public int remove() {
            if (size == 0) {
                System.out.println("Queue is empty!");
                return -1;
            } else {
                int val = arr[f];
                if (f == arr.length - 1) f = 0;
                else f++;
                size--;
                return val;
            }
        }

        public int peak() {
            if (size == 0) {
                System.out.println("Queue is empty!");
                return -1;
            } else return arr[f];
        }

        public void display() {
            if (size == 0) {
                System.out.println("Queue is empty!");
            } else if (f <= r) {
                for (int i = f; i <= r; i++) {
                    System.out.print(arr[i] + " ");
                }
            } else {
                for (int i = f; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                for (int i = 0; i < r; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Cqueue q = new Cqueue();
        q.display();
        q.add(2);
        q.add(1);
        q.add(3);
        q.add(4);
        q.display();
    }
}
