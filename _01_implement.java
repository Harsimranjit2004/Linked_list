package linked_list;

import java.util.LinkedList;

public class _01_implement {
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
        int size = 0 ;
        void insertAtEnd(int data){
            Node temp = new Node(data);
            if(head == null){
                head = temp;
                tail  = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
            size++;
          
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
        int size(){
            Node temp  = head;
            int count= 0;
            while(temp!=null){
                count++;
                temp = temp.next;
            }
            return count;
        }
        void insertAtHead(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
                tail = temp;
            }
            else{
                temp.next = head;
                head = temp;
            }
            size++;
        }
        void insertAt(int idx , int val){
            Node t = new Node(val);
            Node temp = head;
            if(idx ==size()){
                insertAtEnd(val);
                return;
            }
            else if(idx == 0){
                insertAtHead(val);
                return;
            }
            else if(idx<0 || idx > size()){
                System.out.println("wrong index");
                return;
            }
            for(int i = 1; i<=idx-1 ; i++){
                temp = temp.next;
            }
            t.next  = temp.next;
            temp.next = t;
            size++;
        }
        int getAt(int index){
            Node temp = head;

            for(int i =0 ; i<=index;i++){
                temp  = temp.next;
            
            }
            return temp.data;
        }
        void deleteAt(int idx){
            if(idx ==0){
                head = head.next;
                size--;
                return;
            }
            Node temp =  head;
            for(int i = 1; i<idx-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;
            size--;
        }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.display();
        ll.insertAtEnd(3);
        ll.display();
        ll.insertAtHead(5);
        ll.display();
    }
    
}
