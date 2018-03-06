package interviewpractice.linkedlists;

import org.junit.Test;

/**
 * @author benmakusha
 */
public class IsListPalindromeTest {

    private IsListPalindrome is = new IsListPalindrome();

    ListNode<Integer> a1 = new ListNode<>(0);
    ListNode<Integer> a2 = new ListNode<>(1);
    ListNode<Integer> a3 = new ListNode<>(0);
    ListNode[] inputList = new ListNode[] {a1, a2, a3};

    ListNode<Integer> a4 = new ListNode<>(1);
    ListNode<Integer> a5 = new ListNode<>(2);
    ListNode<Integer> a6 = new ListNode<>(2);
    ListNode<Integer> a7 = new ListNode<>(3);
    ListNode[] inputList2 = new ListNode[] {a4, a5, a6, a7};

    ListNode<Integer> a8 = new ListNode<>(10);
    ListNode[] inputList3 = new ListNode[] {a8};

    @Test
    public void testIsListPalindromeIterativeOne() {
        for (int i = 0; i < inputList.length; i++) {
            is.isListPalindromeIterative(inputList[i]);
        }
    }

    @Test
    public void testIsListPalindromeIterativeTwo() {
        for (int i = 0; i < inputList2.length; i++) {
            is.isListPalindromeIterative(inputList2[i]);
        }
    }

    @Test
    public void testIsListPalindromeIterativeThree() {
        for (int i = 0; i < inputList3.length; i++) {
            is.isListPalindromeIterative(inputList3[i]);
        }
    }
}