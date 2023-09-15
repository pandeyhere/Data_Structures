package LinkedList;

public class MiddleOfLinkedList {

    public static void main(String[] args) {
        ListNode node6 = new ListNode(null, 7);
        ListNode node5 = new ListNode(node6, 6);
        ListNode node4 = new ListNode(node5, 5);
        ListNode node3 = new ListNode(node4, 4);
        ListNode node2 = new ListNode(node3, 3);
        ListNode node1 = new ListNode(node2, 2);
        ListNode head = new ListNode(node1, 1);

        ListNode middle = findMiddleOfLinkedList(head);
        System.out.println(middle.data);
    }

    public static ListNode findMiddleOfLinkedList(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;
        int i = 0;
        while (fast != null) {
            fast = fast.next;
            i = i + 1;
            if (i % 2 == 0) {
                slow = slow.next;
            }
        }

        return slow;

    }

}
