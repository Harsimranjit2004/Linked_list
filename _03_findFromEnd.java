package linked_list;

public class _03_findFromEnd {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static Node nthNode(Node head, int n){
        int size = 0;
        Node temp = head;
        while(temp!= null){
            size++;
            temp = temp.next;
        }
        int m = size-n+1;
        // mth node from start
        temp = head;
        for(int i = 1; i<m;i++){
            temp = temp.next;

        }
        return temp;

    }
    public static Node NthNodeGood(Node head,int n){
        Node slow = head;
        Node fast = head;
        for(int i = 0;i<=n;i++){
            fast  = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
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
    }
    
}
