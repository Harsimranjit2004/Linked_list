package linked_list;

public class _19_subLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;

        }
    }
    public static class linkedlist{
        Node head = null;
        Node tail = null;
        int size = 0 ;
        void insertAtEnd(int data){
            Node temp = new Node(data);
            if(head == null){
                head = temp;
                tail  = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
            size++;
          
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
    public static Node reverse(Node head){
        if(head== null || head.next == null) return head;
        Node prev  = null, curr =head;
        while(curr!=null){
            Node forw = curr.next;
            curr.next = prev;
            prev = curr; 
            curr = forw;

        }

        return curr;
    }
    public static Node subList(Node l1, Node l2){
        if(l2==null) return l1;
        if(l1 == null) {
            l2.data = -l2.data;
            return l2;
        }
        Node cc1= reverse(l1);
        Node cc2 = reverse(l2);
        Node head = new Node(-1);
        Node temp  = head;
        Node c1 = cc1, c2 =cc2;
        int carry= 0 ;
        while(c1 != null || c2 !=null || carry!= 0){
            int sum = 0;
            if((c1!=null ? c1.data : 0) > (c2!=null ? c2.data: 0)){
                 sum = c1.data-c2.data + carry;
            }
            else if((c1!=null ? c1.data : 0) < (c2!=null ? c2.data: 0)){
                c1.data = c1.data+10;
                sum= c1.data -c2.data + carry;
                carry = -1;     
            }
            temp.next = new Node(sum);
            c1 = c1.next;
            c2 = c2.next;
        }
        return reverse(head.next);
    }
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    /*
    public static Node subList(Node l1, Node l2){
        if(l2==null) return l1;
        if(l1 == null) {
            l2.data = -l2.data;
            return l2;
        }
        Node cc1= reverse(l1);
        Node cc2 = reverse(l2);
        Node head = new Node(-1);
        Node temp  = head;
        Node c1 = cc1, c2 =cc2;
        int carry= 0 ;
        while(c1 != null || c2 !=null || carry!= 0){
            int diff = carry + c1.val - (c2!=null ? c2.val : 0 );
            if(diff< 0){
                borrwo = -1;
                diff += 10;
            }else{
                borrow = 0 ;
            }
            temp.next = new Node (diff);
            temp = temp.next;
            c1 = c1.enxt;
            if(c2 !=null) c2 = c2.next;
     
     */
}
