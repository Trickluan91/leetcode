package org.leetCode.AddTwoNumbers;

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers(l1, l2, 0);
    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2, int add) {
        int val = l1.val + l2.val + add;
        int addNext = 0;
        if(val >= 10) {
            val =- 10;
            addNext = 1;
        }

        if(l1.next != null && l2.next != null)
            return new ListNode(val, addTwoNumbers(l1.next, l2.next, addNext));
        else if(l1.next == null && l2.next == null){
            if(addNext != 0)
                return new ListNode(val, new ListNode(1));
            return new ListNode(val);
        }
        else if(l1.next == null)
            return new ListNode(val, addTwoNumbers(new ListNode(0), l2.next, addNext));
        else
            return new ListNode(val, addTwoNumbers(l1.next, new ListNode(0), addNext));
    }
}



