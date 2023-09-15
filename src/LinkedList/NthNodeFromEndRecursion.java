package LinkedList;

public class NthNodeFromEndRecursion {

    static int count = 0;

    public static void main(String[] args) throws Exception {
        ListNode node5 = new ListNode(null, 6);
        ListNode node4 = new ListNode(node5, 5);
        ListNode node3 = new ListNode(node4, 4);
        ListNode node2 = new ListNode(node3, 3);
        ListNode node1 = new ListNode(node2, 2);
        ListNode head = new ListNode(node1, 1);
        finNthNodeRecursion(head, 2);
    }

    public static ListNode finNthNodeRecursion(ListNode head, int pos) {
        if (head != null) {
            finNthNodeRecursion(head.next, pos);
            count++;
            if (count == pos) {
                System.out.println(head.data);
                return head;
            }
        }

        return null;
    }

}
