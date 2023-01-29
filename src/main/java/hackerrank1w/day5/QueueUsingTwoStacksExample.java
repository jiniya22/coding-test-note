package hackerrank1w.day5;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingTwoStacksExample {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        QueueViaStack<Integer> queue = new QueueViaStack<>();
        int q = scanner.nextInt();
        while (q > 0) {
            int num = scanner.nextInt();
            if(num == 1) {
                queue.enqueue(scanner.nextInt());
            } else if (num == 2) {
                queue.dequeue();
            } else if (num == 3){
                queue.peek();
            } else if (num == 4){
                queue.printQueueStatus();
            } else {
                continue;
            }
            q--;
        }
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
        addDequeueEle();
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

    private void addDequeueEle() {
        while (!stackDequeue.isEmpty()) {
            stackEnqueue.push(stackDequeue.pop());
        }
    }

    public void peek() {
        if(!stackDequeue.isEmpty()) {
            System.out.println(stackDequeue.peek());
        } else {
            reverseStackEnqueue();
            System.out.println(stackDequeue.peek());
            reverseStackEnqueue();
        }
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
