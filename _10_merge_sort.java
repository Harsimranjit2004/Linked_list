package linked_list;

public class _10_merge_sort {
    /*
     Node temp1 = head1;
     Node temp2 = head2;
     Node head = new Node(100);
     Node temp  = head;
     while(temp1!=null && temp2!=null){
        if(temp1.val<temp2.val){
            Node a  = new Node(temp1.val);
            temp.next  = a;
            temp = a;
            temp1  = temp1.next;
        }
        else{
            Node a  = new Node(temp2.val);
            temp.next  = a;
            temp = a;
            temp2  = temp2.next;
        }
        if(temp1==null){
            temp.next = temp2;
        }else{
            temp.next = temp1
        }
        return head;
     }
     */
    /*
     less space complexity
     Node t1 = head1;
     Node t2  = head2;
     Node h =new Node(100);
     Node t = h;
     while(t1!=null && t2!=null){
        if(t1.val < t2.val){
            t.next = t1;
            t = t1;
            t1 = t1.next;
        }
        else{
            t.next = t2;
            t = t2;
            t2.next;
        }
     }
     if(t1== null){
        t.next = t2;
     }else{
        t.next = t1;
     }
     return h.next
     */

     
}
