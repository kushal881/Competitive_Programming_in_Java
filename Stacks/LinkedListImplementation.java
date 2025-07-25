package Stacks;

public class LinkedListImplementation {
    public static class Node{
        private int data;
        private Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class Stack{
        Node head = null;
        int size = 0;
        void push(int x){
            Node temp = new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        void displayrec(Node h){
            if(h==null) return;
            displayrec(h.next);
            System.out.print(h.data+" ");
        }
        void display(){
            displayrec(head);
        }
        int size(){
            return size;
        }
        int pop(){
            if(head==null) return -1;
            int x = head.data;
            head=head.next;
            size--;
            return x;
        }
        int peek(){
            if(head==null) return -1;
            return head.data;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.push(5);
        st.push(8);
        st.push(9);
        st.display();
        System.out.println();
        st.pop();
        st.display();
        System.out.println();
        System.out.println(st.size());
        System.out.println(st.peek());
    }
}
