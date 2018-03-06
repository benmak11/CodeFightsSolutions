package interviewpractice.linkedlists;

/**
 * @author benmakusha
 */

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

        if (l != null)
            System.out.println(l.value);
        return l;
    }

}
