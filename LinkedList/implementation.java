package LinkedList;

import java.sql.SQLOutput;

public class implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedlist{
        Node head = null;
        Node tail = null;
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
        }
        void insertAtHead(int val){
            Node temp = new Node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
        }
        void insertAt(int idx,int val){
            Node t = new Node(val);
            Node temp = head;
            if(idx==size()){
                insertAtEnd(val);
                return;
            }
            else if(idx==0){
                insertAtEnd(val);
                return;
            }
            else if(idx<0 || idx>size()){
                System.out.println("Wrong Index");
            }
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        int size(){
            Node temp = head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
        int getElement(int a){
            Node temp = head;
            int b = 0;
            for(int i=0;i<size();i++){
                if(i==a){
                    b = temp.data;
                }
                temp=temp.next;
            }
            return b;
        }
        void deletAtIndex(int a){
            Node temp = head;
            if(a==0){
                head=head.next;
            }
            for(int i=1;i<=size()-1;i++){
                if(a==i){
                    temp.next=temp.next.next;
                }
                temp=temp.next;
            }
        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtHead(10);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.display();
        ll.insertAtHead(13);
        ll.display();
        System.out.println("Size of the linkedlist is: "+ll.size());
        ll.insertAt(2,10);
        ll.display();
        System.out.println(ll.getElement(3));
        ll.deletAtIndex(0);
        ll.display();
    }
}
