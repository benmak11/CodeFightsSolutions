package interviewpractice.linkedlists;

/**
 * @author benmakusha
 */

public class MergeTwoLinkedLists {

    public ListNode<Integer> mergeTwoLinkedLists(ListNode<Integer> l1, ListNode<Integer> l2) {
        ListNode<Integer> last = null;
        ListNode<Integer> head = null;
        ListNode<Integer> firstXFactor = l1;
        ListNode<Integer> secondXFactor = l2;
        while(firstXFactor != null || secondXFactor != null) {
            ListNode<Integer> old = last;
            int value = -1;
            if(firstXFactor == null) {
                value = secondXFactor.value;
                secondXFactor = secondXFactor.next;
            } else if(secondXFactor == null) {
                value = firstXFactor.value;
                firstXFactor = firstXFactor.next;
            } else if(firstXFactor.value < secondXFactor.value){
                value = firstXFactor.value;
                firstXFactor = firstXFactor.next;
            } else {
                value = secondXFactor.value;
                secondXFactor = secondXFactor.next;
            }

            last = new ListNode(value);
            if(old != null) old.next = last;
            if(head == null) head = last;
        }
        return head;
    }

}
