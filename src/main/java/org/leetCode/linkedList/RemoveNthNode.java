package org.leetCode.linkedList;

import org.leetCode.models.ListNode;

import java.util.ArrayList;
import java.util.List;

public class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> listNodes = new ArrayList<>();
        ListNode temp = head;
        while(temp != null)
        {
            listNodes.add(temp);
            temp = temp.next;
        }

        if(n == listNodes.size())
            if(listNodes.size() == 1)
                return null;
            else
                head = listNodes.get(1);
        else if (n == 1)
            listNodes.get(listNodes.size() - 2).next = null;
        else
            listNodes.get((listNodes.size() - n) - 1).next = listNodes.get((listNodes.size() - n) + 1);

        return head;
    }
}
