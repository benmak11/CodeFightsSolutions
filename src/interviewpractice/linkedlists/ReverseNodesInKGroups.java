package interviewpractice.linkedlists;

/**
 * @author benmakusha
 */

public class ReverseNodesInKGroups {

    public ListNode<Integer> reverseNodesInKGroups(ListNode<Integer> l, int k) {
        ListNode<Integer> x = l;
        ListNode<Integer> prev = null;
        ListNode<Integer> head = l;
        ListNode<Integer> head_before = null;
        ListNode<Integer> new_head = null;
        int index = 1;
        while(x != null) {
            ListNode<Integer> x_next = x.next;

            if(index != 0 && index % k == 0) {

                ListNode<Integer> x2 = head;
                ListNode<Integer> prev2 = x_next;

                while(x2 != x){
                    ListNode<Integer> x2_next = x2.next;
                    x2.next = prev2;
                    prev2 = x2;
                    x2 = x2_next;
                }

                x.next = prev2;

                if(index == k) {
                    new_head = x;
                }

                if(head_before != null) head_before.next = x;
                head_before = head;
                head = x_next;
            }

            index++;
            prev = x;
            x = x_next;
        }

        if(new_head == null) return l;
        return new_head;
    }
}
