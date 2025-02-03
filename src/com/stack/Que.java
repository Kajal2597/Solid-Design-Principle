package com.stack;

import java.util.LinkedList;

class Queue {
    private LinkedList<Integer> queue;

    public Queue() {
        queue = new LinkedList<>();
    }

    public void enqueue(int item) {
        queue.addLast(item);
        System.out.println("Enqueued " + item + " to queue.");
    }

    public Integer dequeue() {
        if (!isEmpty()) {
            int dequeuedItem = queue.removeFirst();
            System.out.println("Dequeued " + dequeuedItem + " from queue.");
            return dequeuedItem;
        } else {
            System.out.println("Queue is empty!");
            return null;
        }
    }

    public Integer front() {
        if (!isEmpty()) {
            return queue.getFirst();
        } else {
            System.out.println("Queue is empty!");
            return null;
        }
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Front: " + queue.front()); // Output: 1
        System.out.println("Dequeue: " + queue.dequeue()); // Output: 1
        System.out.println("Size: " + queue.size()); // Output: 2
    }
}
