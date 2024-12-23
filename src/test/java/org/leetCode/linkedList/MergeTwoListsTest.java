package org.leetCode.linkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetCode.models.ListNode;

import static org.leetCode.linkedList.LinkedListHelp.arrayToListNode;
import static org.leetCode.linkedList.LinkedListHelp.listNodeToArray;

public class MergeTwoListsTest {
    @Test
    public void test()
    {
        MergeTwoSortedLists mtsl = new MergeTwoSortedLists();

        ListNode result = mtsl.mergeTwoLists(arrayToListNode(new int[]{1,2,4}), arrayToListNode(new int[]{1,3,4}));
        Assertions.assertArrayEquals(new int[]{1,1,2,3,4,4}, listNodeToArray(result, 6));

        ListNode result1 = mtsl.mergeTwoLists(arrayToListNode(new int[]{}), arrayToListNode(new int[]{}));
        Assertions.assertArrayEquals(new int[]{}, listNodeToArray(result1, 0));

        ListNode result2 = mtsl.mergeTwoLists(arrayToListNode(new int[]{}), arrayToListNode(new int[]{0}));
        Assertions.assertArrayEquals(new int[]{0}, listNodeToArray(result2, 1));

        ListNode result3 = mtsl.mergeTwoLists(arrayToListNode(new int[]{1}), arrayToListNode(new int[]{}));
        Assertions.assertArrayEquals(new int[]{1}, listNodeToArray(result3, 1));

        ListNode result4 = mtsl.mergeTwoLists(arrayToListNode(new int[]{1, 2, 5}), arrayToListNode(new int[]{7, 8}));
        Assertions.assertArrayEquals(new int[]{1, 2, 5, 7, 8}, listNodeToArray(result4, 5));
    }
}
