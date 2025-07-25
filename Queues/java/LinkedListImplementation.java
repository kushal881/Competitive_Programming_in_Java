package Queues.java;

public class LinkedListImplementation {
    public static class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
        }
    }
    public static class queue{
        Node head = null;
        Node tail = null;
        int size = 0;
        public void add(int a){
            Node temp = new Node(a);
            if(size==0){
                head = tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
        public int remove(){
            if(size==0){
                System.out.println("Queue is empty!");
                return -1;
            }
            int x = head.data;
            head = head.next;
            size--;
            return x;
        }
        public int peek(){
            if(size==0){
                System.out.println("Queue is empty!");
                return -1;
            }
            return head.data;
        }
        public void display(){
            if(size==0){
                System.out.println("QUEUE is empty!");
            }
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        queue q = new queue();
        q.display();
        q.add(5);
        q.add(4);
        q.add(7);
        q.add(3);
        q.add(1);
        q.display();
        System.out.println();
        System.out.println(q.size);
        q.remove();
        q.display();
        System.out.println();
        System.out.println(q.peek());
    }
}
