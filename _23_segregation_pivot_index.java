package linked_list;

public class _23_segregation_pivot_index {
    /*
     public static Node segregate(Node head, int pivotIdx){
        if(head == null || head.next == null) return head;
        int idx = 0 ;
        Node pivot = head;
        while(pivot != null){
            if(idx == pivotIdx){
                break;
            }
            pivot = pivot.next;
            idx++;
        }
        Node smaller = new Node(-1);
        Node ps = smaller;
        Node larger = new Node(-1);
        Node pl = larger;
        Node curr = head;
        idx = 0 ;
        NOde pivot =null ;
        while(curr != head){
            if(idx == pivotIdx){
                pivot = curr;
            };
            else if(curr.val <= pivot.val){
                sp.next = curr;
                sp  = sp.next;
            }else{
                lp.next =  curr;
                lp = lp.next;
            }
            curr = curr.next;
            idx++;

        }
        sp.next = pivot;
        pivot.next = larger.next;
        lp.next = null
        return smaller.next;

     }
     */
}
