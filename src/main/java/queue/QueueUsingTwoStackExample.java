package queue;

import java.util.Stack;

public class QueueUsingTwoStackExample {
    public static void main(String[] args) {
        QueueViaStack<Integer> stack = new QueueViaStack<>();
        stack.enqueue(42);
        stack.enqueue(11);
        stack.enqueue(9);
        stack.printQueueStatus();
        System.out.println(stack.peek());

        stack.dequeue();
        stack.printQueueStatus();
        System.out.println(stack.peek());

        stack.enqueue(1);
        stack.printQueueStatus();
        System.out.println(stack.peek());



        stack.dequeue();
        stack.printQueueStatus();
        System.out.println(stack.peek());

        stack.enqueue(77);
        stack.printQueueStatus();
        System.out.println(stack.peek());
    }


}

class QueueViaStack<E> {
    private final Stack<E> stackEnqueue;
    private final Stack<E> stackDequeue;

    public QueueViaStack() {
        stackEnqueue = new Stack<>();
        stackDequeue = new Stack<>();
    }

    public void enqueue(E e) {
        stackEnqueue.push(e);
    }

    public E dequeue() {
        reverseStackEnqueue();
        E ele = stackDequeue.pop();
        reverseStackEnqueue();
        return ele;
    }

    private void reverseStackEnqueue() {
        if (stackDequeue.isEmpty()) {
            while (!stackEnqueue.isEmpty()) {
                stackDequeue.push(stackEnqueue.pop());
            }
        }
    }

    public E peek() {
        reverseStackEnqueue();
        return stackDequeue.peek();
    }

    public void printQueueStatus() {
        System.out.println("----------");
        System.out.println("Enqueue size: " + stackEnqueue.size());
        System.out.println(stackEnqueue);
        System.out.println("Dequeue size: " + stackDequeue.size());
        System.out.println(stackDequeue);
        System.out.println("----------");
    }
}