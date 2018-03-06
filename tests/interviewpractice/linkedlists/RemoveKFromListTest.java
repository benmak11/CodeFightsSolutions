package interviewpractice.linkedlists;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * @author benmakusha
 */
public class RemoveKFromListTest {

    private RemoveKFromList remove = new RemoveKFromList();

    ListNode a1 = new ListNode(3);
    ListNode a2 = new ListNode(1);
    ListNode a3 = new ListNode(2);
    ListNode a4 = new ListNode(3);
    ListNode a5 = new ListNode(4);
    ListNode a6 = new ListNode(5);
    ListNode[] arrayNodes = new ListNode[] {a1, a2, a3, a4, a5, a6};

    @Test
    public void removeKFromList() {
        for (int i = 0; i < arrayNodes.length; i++) {
            remove.removeKFromList(arrayNodes[i], 3);
        }
    }
}