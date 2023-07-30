package linked_list;

public class _24_quicksort {
    /*
    public static int length(Node node){
        if(node == null) return 0;
        Node curr = node;
        int len = 0;
        while(curr!=null){
            len++;
            curr = curr.next;
        }
    }
     public static Node[] segregate(Node head, int pivotIdx){
        Node small = new Node(-1);
        Node large = new Node(-1);
        Node curr = head, sp = small, lp = large , pivotNode = head;
        while(pivotIdx-- > 0) pivotNode = pivotNode.next;

        while(curr != null){
            if(curr!= pivot){
                if(curr.val <= pivotNode.val){
                    sp.next = curr;
                    sp = sp.next;
                }else{
                    lp.next = curr;
                    lp = lp.next;
                }
            }
            curr = curr.next;
            
        }
        sp.next = null
        lp.next = null;
        pivotNode.next = null

        return new Node[]{small.next, pivotNode, large.next}
     }
     public static Node[] mergeSortedList(Node[] leftSortedList, Node pivotNode , Node[] rightSortedList){
        Node head = null, tail = null;
        if(leftSortedList[0] !=null && rightSortedList[0]){
            leftSortedList[1].next = pivotNode;
            pivotNode.next = rightSortedList[0];
            head  = leftSortedList[0];
            tail = rightsortedList[1]
        }else if(leftSortedList[0] != null){
            head = leftsortedList[0];
            leftsortedList[1].next = pivotNode;
            tail = pivotNode;
        }else if(rightSortedList[0] != null){
            head = pivotNode;
            pivotNode.next = rightSortedList[0];
            tail = rightSortedList[1];
        }
        else{
            head = tail = pivotNode;
        }
        return new Node[]{head, tail};
     }

     public static Node[] quickSort_(Node head){
        if(head == null || head.next == null){
            return new Node[]{head,head};
        }
        int len = length(head);
        int pivotIdx = len/2;
        Node[] seglist = segregate(head, pivotIdx);
        Node[] leftsortList = quickSort_(seglis[0]); 
        Node[] rightsortList = quickSort_(seglis[2]); 
        return mergeSortedList(leftSortedList, seglist[1], rightSortedList )

     }
     public static Node quickSort(Node head){
        return quickSort_(head)[0];
     }
     */
}
