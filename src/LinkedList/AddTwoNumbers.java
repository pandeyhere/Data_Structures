package LinkedList;

public class AddTwoNumbers {

    public static void main(String[] args) {

        // List #1
        ListNode node2 = new ListNode(null, 2);
        ListNode node1 = new ListNode(node2, 9);
        ListNode head1 = new ListNode(node1, 5);

        // List #2
        ListNode node30 = new ListNode(null, 6);
        ListNode node20 = new ListNode(node30, 1);
        ListNode head10 = new ListNode(node20, 7);

        ListNode newHead = sumOfLists(head1, head10, 0);

        while (newHead != null) {
            System.out.println(newHead.data);
            newHead = newHead.next;
        }
    }

    private static ListNode sumOfLists(ListNode head1, ListNode head2, int carry) {
        if (head1 == null && head2 == null & carry == 0) {
            return null;
        }
        int data = (head1.data + head2.data + carry) % 10;
        carry = (head1.data + head2.data) / 10;

        ListNode newHead = new ListNode(null, data);

        if (head1 != null || head2 != null) {
            ListNode tmp = sumOfLists(head1.next, head2.next, carry);
            newHead.next = tmp;
        }

        return newHead;
    }

}
