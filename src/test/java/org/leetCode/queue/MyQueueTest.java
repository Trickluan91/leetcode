package org.leetCode.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyQueueTest {
    @Test
    public void test(){
        MyQueue myQueue = new MyQueue();
        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        Assertions.assertEquals(1, myQueue.peek()); // return 1
        Assertions.assertEquals(1, myQueue.pop()); // return 1, queue is [2]
        Assertions.assertFalse(myQueue.empty()); // return false
    }
}
