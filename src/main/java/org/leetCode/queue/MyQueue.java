package org.leetCode.queue;

import java.util.Stack;

public class MyQueue {
    private final Stack<Integer> stack1 = new Stack<>();
    private final Stack<Integer> stack2 = new Stack<>();

    public MyQueue() {}

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        if(stack1.isEmpty()) return -1;

        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }

        int result = stack2.pop();

        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }

        return result;
    }

    public int peek() {
        if(stack1.isEmpty()) return -1;

        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }

        int result = stack2.peek();

        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }

        return result;
    }

    public boolean empty() {
        return stack1.isEmpty();
    }
}
