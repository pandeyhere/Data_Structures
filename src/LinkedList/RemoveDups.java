package LinkedList;

import java.util.HashMap;

public class RemoveDups {

    public static void main(String[] args) {
        ListNode node5 = new ListNode(null, 6);
        ListNode node4 = new ListNode(node5, 3);
        ListNode node3 = new ListNode(node4, 3);
        ListNode node2 = new ListNode(node3, 3);
        ListNode node1 = new ListNode(node2, 2);
        ListNode head = new ListNode(node1, 1);

        ListNode newHead = removeDups(head);

        while (newHead != null) {
            System.out.println(newHead.data);
            newHead = newHead.next;

        }
    }

    private static ListNode removeDups(ListNode head) {
        HashMap<Integer, ListNode> allNodes = new HashMap<>();

        ListNode tmp = head;
        ListNode prev = null;

        while (tmp != null) {
            if (!allNodes.containsKey(tmp.data)) {
                allNodes.put(tmp.data, tmp);
                prev = tmp;
            } else {
                prev.next = tmp.next;
            }
            tmp = tmp.next;

        }

        return head;
    }

}
