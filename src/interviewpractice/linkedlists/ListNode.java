package interviewpractice.linkedlists;

/**
 * @author benmakusha
 */
public class ListNode<T> {
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
