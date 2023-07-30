package linked_list;

public class _18_addLinkedList {
    /*
     public static Node reverse(Node head){
        if(head== null || head.next == null) return head;)
        Node prev  = null, current =head;
        while(curr!=null){
            Node forw = curr.next;
            curr.next = prev;
            prev = curr; 
            curr = forw;
        }
        pulic static Node addTwoNumber(Node l1, Node l2){
            if(l1 == null || l2 == null){
                return l1 != null ? l1:l2;
            }
            Node c1 = reverse(l1);
            Node c2 = reverse(l2);
            Node head = new Node(-1);
            Node itr = head;
            int carry = 0;
            while(c1!=null || c2 !=null || carry !=0){
                int sum = carry + (c1 != null ? c1.val : 0) + (c2!=null ? c2.val: 0);
                int digit  = sum%10;
                carry = sum/10;
                itr.next = new NOde(digit)
                itr = itr.next;
                if(c1!=null) c1 = c1.next;
                if(c2!=null) c2 = c2.next;

            }

            return reverse(head.next);
        }
     }
     */
}
