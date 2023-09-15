package LinkedList;
import java.util.*;


public class ReverseKNodes {

        public static ListNode reverse(ListNode head, int p, int q) {
            if(p == q){
                return head;
            }
            ListNode current=head;
            ListNode prev = null;

            for(int i=0;i<p-1 && current!=null;++i){
                prev = current;
                current = current.next;
            }

            ListNode lastNodeOfFirstPart = prev;
            ListNode lastNodeOfSubList = current;
            ListNode next=null;

            for(int j=0; j< q-p+1;j++){
                //reverse the list
                next = current.next;
                current.next = prev;
                prev=current;
                current = next;

            }

            if(lastNodeOfFirstPart != null){
                lastNodeOfFirstPart.next=prev;
            }else{
                head = prev;
            }

            lastNodeOfSubList.next = current;
            return head;
        }

        public static void main(String[] args) {
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);

            ListNode result = ReverseKNodes.reverse(head, 2, 4);
            System.out.print("Nodes of the reversed LinkedList are: ");
            while (result != null) {
                System.out.print(result.data + " ");
                result = result.next;
            }
        }


}
