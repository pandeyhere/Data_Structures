package LinkedList;

public class FindIntersectionOfLinkedList {
    public static void main(String[] args) throws Exception {
        // List #1
        ListNode node5 = new ListNode(null, 6);
        ListNode node4 = new ListNode(node5, 5);
        ListNode node3 = new ListNode(node4, 4);
        ListNode node2 = new ListNode(node3, 3);
        ListNode node1 = new ListNode(node2, 2);
        ListNode head1 = new ListNode(node1, 1);

        // List #2
        ListNode node30 = new ListNode(node4, 4);
        ListNode head10 = new ListNode(node30, 1);

        ListNode intersection = findIntersectionPoint(head1, head10);
        System.out.println(intersection.data);
    }

    private static ListNode findIntersectionPoint(ListNode list1, ListNode list2) {
        int len1 = 0;
        int len2 = 0;
        int diff = 0;
        ListNode head1 = list1, head2 = list2;
        while (head1 != null) {
            len1++;
            head1 = head1.next;
        }
        while (head2 != null) {
            len2++;
            head2 = head2.next;
        }

        if (len1 > len2) {
            diff = len1 - len2;
            head1 = list1;
            head2 = list2;
        } else {
            diff = len2 - len1;
            head1 = list2;
            head2 = list1;
        }

        for (int i = 0; i < diff; i++) {
            head1 = head1.next;
        }

        while (head1 != null && head2 != null) {
            if (head1 == head2) {
                return head1;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return null;

    }
}
