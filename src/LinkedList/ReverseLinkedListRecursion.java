package LinkedList;

public class ReverseLinkedListRecursion {

    public static void main(String[] args) {
        ListNode node5 = new ListNode(null, 6);
        ListNode node4 = new ListNode(node5, 5);
        ListNode node3 = new ListNode(node4, 4);
        ListNode node2 = new ListNode(node3, 3);
        ListNode node1 = new ListNode(node2, 2);
        ListNode head = new ListNode(node1, 1);

        reverseLinkedListRecursion(head, head);
    }

    public static void reverseLinkedListRecursion(ListNode current, ListNode head) {
        if (current == null) {
            return;
        }
        ListNode next = current.next;

        if (next == null) {
            head = current;
            return;
        }

        reverseLinkedListRecursion(next, head);
        next.next = current;
        current.next = null;
    }

}
