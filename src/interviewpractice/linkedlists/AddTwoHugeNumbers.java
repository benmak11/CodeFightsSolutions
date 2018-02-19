package interviewpractice.linkedlists;

/**
 * @author benmakusha
 */

public class AddTwoHugeNumbers {

    ListNode<Integer> addTwoHugeNumbers(ListNode<Integer> a, ListNode<Integer> b) {
        if(a == null) return b;
        if(b == null) return a;
        if(isZero(b)) {
            return trim(a);
        }
        ListNode<Integer> carry = computeCarry(a, b);
        a = computeRemainder(a, b);
        return addTwoHugeNumbers(a, carry);
    }

    ListNode<Integer> trim(ListNode<Integer> a) {
        while(a != null && a.value == 0) {
            a = a.next;
        }
        if(a == null){
            return new ListNode<Integer>(0);
        }
        return a;
    }

    boolean isZero(ListNode<Integer> b) {
        while(b !=null) {
            if(b.value != 0) {
                return false;
            }
            b = b.next;
        }
        return true;
    }

    ListNode<Integer> computeCarry(ListNode<Integer> a, ListNode<Integer> b) {
        a = reverse(a);
        b = reverse(b);
        ListNode<Integer> head = null;
        ListNode<Integer> old = null;
        int val3 = 0;
        while(a != null || b != null) {
            int val1 = a != null ? a.value : 0;
            int val2 = b != null ? b.value : 0;
            val3 = (val1 + val2) / 10000;

            old = head;
            head = new ListNode<Integer>(val3);
            head.next = old;

            if(a != null) a = a.next;
            if(b != null) b = b.next;
        }

        ListNode<Integer> x = head;
        while(x != null) {
            if(x.next == null){
                x.next = new ListNode<Integer>(0);
                break;
            }
            x = x.next;
        }


        return head;
    }

    ListNode<Integer> computeRemainder(ListNode<Integer> a, ListNode<Integer> b) {
        a = reverse(a);
        b = reverse(b);
        ListNode<Integer> head = null;
        while(a != null || b != null) {
            int val1 = a != null ? a.value : 0;
            int val2 = b != null ? b.value : 0;


            int val3 = (val1 + val2) % 10000;

            ListNode<Integer> old = head;
            head = new ListNode<Integer>(val3);
            head.next = old;

            if(a != null) a = a.next;
            if(b != null) b = b.next;
        }

        return head;
    }

    ListNode<Integer> reverse(ListNode<Integer> a) {
        ListNode<Integer> x = a;
        ListNode<Integer> head = null;
        while(x != null) {

            ListNode<Integer> old = head;
            head = new ListNode<Integer>(x.value);
            head.next = old;
            x = x.next;
        }
        return head;
    }
}
