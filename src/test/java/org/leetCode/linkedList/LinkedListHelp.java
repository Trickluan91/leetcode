package org.leetCode.linkedList;

import org.leetCode.models.ListNode;

public class LinkedListHelp {
    public static ListNode arrayToListNode(int[] arr) {
        ListNode root = null;
        for (int i = arr.length - 1; i >= 0; i--) {
            ListNode temp = new ListNode(arr[i]);
            temp.next = root;
            root = temp;
        }
        return root;
    }

    public static int[] listNodeToArray(ListNode listNode, int length)
    {
        int[] array = new int[length];
        int count = 0;
        while(listNode != null && count < length){
            array[count] = listNode.val;
            count++;
            listNode = listNode.next;
        }
        return array;
    }
}
