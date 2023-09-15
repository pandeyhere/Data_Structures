package LinkedList;

public class MergeTwoLists {

    // 1->4->7->8->null
    // 2->3->5->9->null

    // Merged: 1->2->3->4->5->7->8->9->null

    public static void main(String[] args) {
        ListNode node3 = new ListNode(null, 8);
        ListNode node2 = new ListNode(node3, 7);
        ListNode node1 = new ListNode(node2, 4);
        ListNode head = new ListNode(node1, 1);

        ListNode node31 = new ListNode(null, 9);
        ListNode node21 = new ListNode(node31, 5);
        ListNode node11 = new ListNode(node21, 3);
        ListNode head1 = new ListNode(node11, 2);

        ListNode newHead = mergeTwoLists(head, head1);

        while (newHead != null) {
            System.out.println(newHead.data);
            newHead = newHead.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        ListNode newHead, tail = null;

        if (head1.data < head2.data) {
            newHead = tail = head1;
            head1 = head1.next;
        } else {
            newHead = tail = head2;
            head2 = head2.next;
        }

        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                ListNode newNode = new ListNode(null, head1.data);
                tail.next = newNode;
                tail = tail.next;
                head1 = head1.next;
            } else {
                ListNode newNode = new ListNode(null, head2.data);
                tail.next = newNode;
                tail = tail.next;
                head2 = head2.next;
            }
        }

        while (head1 != null) {
            ListNode newNode = new ListNode(null, head1.data);
            tail.next = newNode;
            tail = tail.next;
            head1 = head1.next;
        }

        while (head2 != null) {
            ListNode newNode = new ListNode(null, head2.data);
            tail.next = newNode;
            tail = tail.next;
            head2 = head2.next;
        }

        return newHead;
    }

}
