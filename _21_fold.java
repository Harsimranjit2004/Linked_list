package linked_list;

public class _21_fold {
    /*
     public static Node midNode(NOde head){
        if(head == null || head.next == null) return head;
        Node slow = head;
        Node fast = head;
        while(fast.next !=null && fast.next.next !=null){
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
     }
     public static Node reverse(Node head){
        if(head == null || head.next == null) return head;
        Node prev  = null;
        Node curr = head;
        Node forw = null;
        while(curr !=null){
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        return prev;
     }
     public static fold(NOde head){
        if(head == null || head.next == null) reutn head;

        Node mid = midNode(head);
        Node newHead = mid.next;
        mid.next = null;
        newHead = reverse(newHead);
        Node c1 =head;
        Node c2 = newHead;
        Node f1 = null;
        Node f2 = null;
        while(c1!=null&& c2!=null){
            f1 = c1.next;
            f2 = c2.next;

            c1.next = c2;
            c2.next = f1;
            // move 
            c1 = f1;
            c2 = f2;
        }
     }
     */
}
