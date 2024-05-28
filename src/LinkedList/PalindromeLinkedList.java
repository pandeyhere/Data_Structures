package LinkedList;

public class PalindromeLinkedList{

    private static boolean isLinkedListPalindrome(ListNode head){
        ListNode middle = findMiddle(head);
        ListNode subListHead = reverse(middle);
        ListNode copySubListHead = subListHead;

        while(subListHead != null && head != null){
            if (head.data != subListHead.data){
                break;
            }
            head=head.next;
            subListHead=subListHead.next;

        }

        reverse(copySubListHead);
        if(head == null && subListHead == null){
            return true;
        }
        return  false;
    }

    private static ListNode reverse(ListNode head){
        ListNode prev = null;
        while(head != null){
            ListNode next = head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }

    private static ListNode findMiddle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast=fast.next.next;
            slow=slow.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        head.next = new ListNode(4);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(2);
        System.out.println("Is palindrome: " + PalindromeLinkedList.isLinkedListPalindrome(head));

        head.next.next.next.next.next = new ListNode(2);
        System.out.println("Is palindrome: " + PalindromeLinkedList.isLinkedListPalindrome(head));
    }

}
