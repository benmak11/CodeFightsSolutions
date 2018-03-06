package interviewpractice.linkedlists;

import java.util.Stack;

/**
 * @author benmakusha
 */

public class IsListPalindrome {

    // Iterative Solution
    boolean isListPalindromeIterative(ListNode<Integer> l) {
        ListNode<Integer> fast = l;
        ListNode<Integer> slow = l;

        Stack<Integer> stack = new Stack<>();

        while(fast != null && fast.next != null) {
            stack.push(slow.value);
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null) {
            slow = slow.next;
        }

        while (slow != null) {
            int top = stack.pop().intValue();
            System.out.println("top: " + top + "\nslow.value: " + slow.value);

            if (top != slow.value) {
                return false;
            }
            slow = slow.next;
        }
        return true;
    }

    /**
    public boolean isListPalindrome(ListNode<Integer> l) {

        ListNode<Integer> ourListNode = l;

        ListNode<Integer> head = null;
        int index = 0;
        while(ourListNode != null) {
            ListNode<Integer> old = head;
            head = new ListNode<>(ourListNode.value);
            head.next = old;

            ourListNode = ourListNode.next;
            index++;
        }

        ListNode<Integer> ourSecondListNode = head;
        int index2 = 0;
        ourListNode = l;
        while(ourListNode != null) {
            if(index2 > index / 2) break;
            if(ourListNode.value.intValue() != ourSecondListNode.value.intValue()) {
                return false;
            }
            ourListNode = ourListNode.next;
            ourSecondListNode = ourSecondListNode.next;
            index2++;
        }
        return true;
    }
     */
}
