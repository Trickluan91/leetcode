package org.leetCode.linkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetCode.models.ListNode;

import static org.leetCode.linkedList.LinkedListHelp.arrayToListNode;
import static org.leetCode.linkedList.LinkedListHelp.listNodeToArray;

public class AddTwoNumbersTest {
    @Test
    public void test1(){
        ListNode result = AddTwoNumbers.addTwoNumbers(arrayToListNode(new int[]{2,4,3}), arrayToListNode(new int[]{5,6,4}));
        Assertions.assertArrayEquals(new int[]{7,0,8}, listNodeToArray(result, 3));

        ListNode result1 = AddTwoNumbers.addTwoNumbers(arrayToListNode(new int[]{0}), arrayToListNode(new int[]{0}));
        Assertions.assertArrayEquals(new int[]{0}, listNodeToArray(result1, 1));

        ListNode result2 = AddTwoNumbers.addTwoNumbers(arrayToListNode(new int[]{9,9,9,9,9,9,9}), arrayToListNode(new int[]{9,9,9,9}));
        Assertions.assertArrayEquals(new int[]{8,9,9,9,0,0,0,1}, listNodeToArray(result2, 8));
    }
}
