package linked_list;

public class _12_reverseLinkedList {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;

        }
    }
    public static void display(Node head){
        if(head == null){
            return;
        }
        System.out.println(head.val);
        display(head.next);
    }
    public static Node reverse(Node head){
        if(head.next == null) return head;
        Node newHead = reverse(head.next);
        head.next.next = head;// interchanging connections
        head.next = null;
        return newHead;
    }
    public static void main(String[] args) {
        Node a = new Node(5); // head node 
       
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);
        a.next = b;
        b.next = c;
        c.next  = d;
        d.next = e;
        display(a);
        Node r = reverse(a);
        display(r);

        /*
         Node current = head;
         Node prev = null;
         Node agla = null;
         while(current!= null){
            agla = current.next;
            current.next = prev;
            prev = current;
            current = agla;
         }
         retrun current
         */
    }
}
