package org.leetCode.queue;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class MyStack {
    private final Queue<Integer> q1 = new LinkedList<>();
    private final Queue<Integer> q2 = new LinkedList<>();

    public MyStack() {}

    public void push(int x) {
        q1.add(x);
    }

    public int pop() throws NoSuchElementException {
        if(q1.isEmpty()) return -1;

        while(q1.size() > 1)
            q2.add(q1.poll());

        int result = q1.poll();

        while(!q2.isEmpty())
            q1.add(q2.poll());

        return result;
    }

    public int top() throws NoSuchElementException {
        if(q1.isEmpty()) return -1;

        while(q1.size() > 1)
            q2.add(q1.poll());

        int res = q1.peek();
        q2.add(q1.poll());

        while(!q2.isEmpty()) {
            q1.add(q2.poll());
        }

        return res;
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}
