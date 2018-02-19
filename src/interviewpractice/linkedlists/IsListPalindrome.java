package interviewpractice.linkedlists;

/**
 * @author benmakusha
 */

public class IsListPalindrome {

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
}
