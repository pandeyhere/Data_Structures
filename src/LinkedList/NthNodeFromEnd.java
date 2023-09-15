package LinkedList;

class ListNode {
    public ListNode(int data) {
        this.data = data;
    }

    public ListNode next;
    int data;

    public ListNode(ListNode next, int data) {
        this.data = data;
        this.next = next;
    }

}

public class NthNodeFromEnd {
    public static void main(String[] args) throws Exception {
        ListNode node5 = new ListNode(null, 6);
        ListNode node4 = new ListNode(node5, 5);
        ListNode node3 = new ListNode(node4, 4);
        ListNode node2 = new ListNode(node3, 3);
        ListNode node1 = new ListNode(node2, 2);
        ListNode head = new ListNode(node1, 1);
        finNthNode(head, 2);
    }

    public static ListNode finNthNode(ListNode head, int pos) {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        ListNode nthNode = null;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }
        while (temp != null) {
            temp = temp.next;
            if (nthNode == null) {
                nthNode = head;
            } else {
                nthNode = nthNode.next;
            }
        }
        if (nthNode != null) {
            System.out.println(nthNode.data);
            return nthNode;
        }
        return null;
    }
}
