package linked_list;

public class _20_multiplication {
    /*
     public static Node reverse(Node head){
        if(head == null || head.next = null) return head;
        Node curr = head;
        Node prev = null;
        while(curr != null){
            Node forw = curr.next;
            curr.next = prev;
            prev = curr ;
            curr = forw;
        }
        return prev;

     }
     pulic static void multiplydigit(Node l1, int digit){
        Node dummy = new Node(-1);
        Node ac = dummy;
        Node curr = head;
        int carry = 0 ;
        while(curr !=null || carry !=0){
            int sum = carry + (curr !=null ? curr.val : 0) * digit;
            int digit  = sum % 10 ;
            carry = sum/10;
            ac.next = new Node(digit);
            if(curr !=null) curr = curr.next;
            ac = ac.next;
        }
        return dummy.next;
     }
     publc static void addTwoList(Node head, Node ansItr){
        Node c1 = head;
        Node c2 = ansItr;
        int carry = 0 ;
        while(c1 !=null || carry!=0){
            int sum  = carry + (c1 !=null ? c1.val : 0) + (c2.next != null ? c2.next.val : 0);
            int digit = sum%10;
            carry = sum/10;
            if(c2.next !=null) c2.next.val = digit;
            else c2.next = new Node(digit);

            if(c1!=null) c1= c1.next;
            c2 = c2.next;

        }
     }
     public static Node muliply(Node l1, Node l2){
        l1 = reverse(l1);
        l2 = reverse(l2);
        Node l2_itr = l2;
        Node dummy = new Node (-1);
        Node ansItr = dummy;
        while(l2_itr !=null){
            Node prod = multiplydigit(l1,l2_itr.data);
            l2_itr = l2_itr.next;
            addTwoLinkedList(prod, ansItr)
            ansIt = ansItr.next;

        }
        return dummy.next;
     }
     */
}
