package interviewpractice.linkedlists;

/**
 * @author benmakusha
 */

public class RearrangeLastN {

    public ListNode<Integer> rearrangeLastN(ListNode<Integer> l, int n) {
        ListNode<Integer> x = l;
        ListNode<Integer> head = null;
        ListNode<Integer> last = null;

        if(l == null) return l;

        int count = 1;
        while(x != null) {
            ListNode<Integer> old = last;
            last = new ListNode(x.value);
            if(old != null) old.next = last;
            if(head == null) head = last;

            if(x.next == null){
                x.next = head;
                break;
            }

            x = x.next;
            count++;
        }


        if(n > count) {
            n %= count;
        }

        ListNode<Integer> newHead = l;
        for(int i=0; i < count - n; ++i) {
            newHead = newHead.next;
        }
        ListNode<Integer> newLast = newHead;
        for(int i=0; i < count-1; ++i) {
            newLast = newLast.next;
        }
        newLast.next = null;

        return newHead;
    }

}
