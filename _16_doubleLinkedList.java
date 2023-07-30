package linked_list;

import javax.swing.plaf.synth.SynthPasswordFieldUI;

public class _16_doubleLinkedList {
    public static class Node{
        int val;
        Node next ; 
        Node prev;
        Node(int val){
            this.val = val;
        }
    }
    public static void display(Node head){
        Node temp = head;
         while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
         }
    }
    public static void displayr(Node tail){
        Node temp = tail;
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.prev;
        }
    }
    public static void displayRandom(Node random){
        Node temp = random;
        //move temp to head;
        while(temp.prev!=null){
            temp=temp.prev;
        }
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    public static Node insertHead(Node head , int x){
        Node t = new Node(x);
        t.next =  head;
        head.prev = t ; 
        head = t;
        return head;
    }
    public static void insertAtTail(Node head, int x){
        Node temp = head;
        // temp ko tail tak
        while(temp.next!=null){
            temp = temp.next;
        }
        Node t  = new Node(x);
        temp.next = t; 
        t.prev = temp;
        temp= t;
    }
    public static void insert(Node head, int idx , int x){
        Node s = head;
        for(int i=1;i<=idx-1;i++){
            s = s.next;
        }
        Node r = s.next;
        Node t  = new Node(x);
        s.next = t;
        t.prev= s;
        t.next = r;
        r.prev = t;
    }
    public static void main(String[] args) {
            // 4 10 2 99 13

            Node a = new Node(4);
            Node b = new Node(10);
            Node c = new Node(2);
            Node d = new Node(99);
            Node e = new Node(13);
            a.prev  = null;
            a.next = b;
            b.prev = a; 
            b.next = c ; 
            c.prev  = b;
            c.next = d;
            d.prev =  c;
            d.next = e;
            e.prev = d;
            e.next = null;

    }
}
