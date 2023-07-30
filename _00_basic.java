package linked_list;

public class _00_basic {
    public static void displayR(Node head){
        if(head== null){
            return;
        }
        System.out.println(head.data);
        displayR(head.next);
    }
    public static void displayReverse(Node head){
        if(head == null ) return;
        displayReverse(head.next);
        System.out.println(head.data);
    }
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp  = temp.next;
        }
    }
    public static int length(Node a){
        int count  = 0;
        while(a!=null){
            count++;
            a = a.next;
        }
        return count;
    }
    // public static int lengthR(Node head){
    //     int count = 0 ;
    //     int len = lengthR(head.next);
    // }
    public static class Node{
        int data; // value
        Node next; // address of next node
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5); // head node 
        System.out.println(a.next);// null
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);
        // System.out.println(x); // give ajjeb value
        
        a.next = b;
        b.next = c;
        c.next  = d;
        d.next = e;
        display(a);
        // System.out.println(a.next);//linked_list._00_basic$Node@4617c264
        // System.out.println(b); //linked_list._00_basic$Node@4617c264 same

        // System.out.println(b.data);
        // System.out.println(a.next.data);// both above are same

        // display the linked list
        // System.out.println(a.data);
        // System.out.println(a.next.data);
        // System.out.println(a.next.next.data);
        // System.out.println(a.next.next.next.data);
        // System.out.println(a.next.next.next.next.data);
        Node temp = a;
        // for(int i =1 ; i<=5;i++){
        //     System.out.println(temp.data);
        //     temp = temp.next;
        // }
        while(temp!=null){
            System.out.println(temp.data);
            temp= temp.next;
        }
    }
}
