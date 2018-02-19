package interviewpractice.linkedlists;

/**
 * @author benmakusha
 */

class ListNode<T> {
    T value;
    ListNode<T> next;

    ListNode (T x) {
        value = x;
    }

    public void add(T item) {
        if (item == null) {
            throw new NullPointerException("No nulls allowed");
        }
        if (!isEmpty()) {
            ListNode<T> prev = next;
            next = new ListNode(item);
            prev.next = next;
        } else {
            next = new ListNode(item);
        }
    }

    public boolean isEmpty() {
        return value != null;
    }
}

public class RemoveKFromList {

    public ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {
        ListNode<Integer> ourListNode = l;
        ListNode<Integer> previous = null;
        while(ourListNode != null) {
            ListNode<Integer> ourNode_next = ourListNode.next;
            if(ourListNode.value == k) {
                if(previous != null) {
                    previous.next = ourNode_next;
                } else {
                    l = ourNode_next;
                }
            } else {
                previous = ourListNode;
            }
            ourListNode = ourNode_next;
        }

        return l;
    }

}
