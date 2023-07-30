package linked_list;

public class _04_removeNthNodeLast {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static Node nthNode(Node head , int n){
        Node slow = head;
        Node fast = head;
        for(int i = 1; i<=n;i++){
            fast = fast.next;
        }
        if(fast == null){
            head = head.next;
            return head;
        }
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next  = slow.next.next;
        return head;



    }
    public static void main(String[] args) {
        Node a = new Node(5); // head node 
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);
        Node f = new Node(10);

        a.next = b;
        b.next = c;
        c.next  = d;
        d.next = e;
        e.next = f;
        Node temp = nthNode(a,3);
        a = nthNode(a, 0);
    }
}
