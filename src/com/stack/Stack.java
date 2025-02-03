package com.stack;

import java.util.ArrayList;

class Stack {
    private ArrayList<Integer> stack;

    public Stack() {
        stack = new ArrayList<>();
    }

    public void push(int item) {
        stack.add(item);
        System.out.println("Pushed " + item + " to stack.");
    }

    public Integer pop() {
        if (!isEmpty()) {
            int poppedItem = stack.remove(stack.size() - 1);
            System.out.println("Popped " + poppedItem + " from stack.");
            return poppedItem;
        } else {
            System.out.println("Stack is empty!");
            return null;
        }
    }

    public Integer peek() {
        if (!isEmpty()) {
            return stack.get(stack.size() - 1);
        } else {
            System.out.println("Stack is empty!");
            return null;
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Peek: " + stack.peek()); // Output: 3
        System.out.println("Pop: " + stack.pop());   // Output: 3
        System.out.println("Size: " + stack.size());  // Output: 2
    }
}
