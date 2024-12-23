package org.leetCode.linkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetCode.models.ListNode;

import static org.leetCode.linkedList.LinkedListHelp.arrayToListNode;
import static org.leetCode.linkedList.LinkedListHelp.listNodeToArray;

public class RemoveNthNodeTest {
    @Test
    public void test(){
        RemoveNthNode rn = new RemoveNthNode();

        ListNode result = rn.removeNthFromEnd(arrayToListNode(new int[]{1,2,3,4,5}), 2);
        Assertions.assertArrayEquals(new int[]{1,2,3,5}, listNodeToArray(result, 4));

        ListNode result1 = rn.removeNthFromEnd(arrayToListNode(new int[]{1}), 1);
        Assertions.assertArrayEquals(new int[]{}, listNodeToArray(result1, 0));

        ListNode result2 = rn.removeNthFromEnd(arrayToListNode(new int[]{1,2}), 1);
        Assertions.assertArrayEquals(new int[]{1}, listNodeToArray(result2, 1));

        ListNode result3 = rn.removeNthFromEnd(arrayToListNode(new int[]{1,2}), 2);
        Assertions.assertArrayEquals(new int[]{2}, listNodeToArray(result3, 1));
    }
}
