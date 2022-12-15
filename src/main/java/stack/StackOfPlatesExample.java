package stack;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Stack;

public class StackOfPlatesExample {
    public static void main(String[] args) {
        StackOfPlate stack = new StackOfPlate(3);
        stack.push(5);
        stack.push(9);
        stack.push(12);
        stack.push(4);
        stack.push(99);
        stack.push(81);
        stack.push(3);
        stack.push(31);
        stack.push(27);
        stack.push(77);
        stack.printStacks();

        stack.popAt(1);
        stack.printStacks();

        stack.pop();
        stack.printStacks();
    }
}

class StackOfPlate {
    private final int STACK_SIZE;
    private final LinkedList<Stack<Integer>> stacks = new LinkedList<>();

    public StackOfPlate() {
        this.STACK_SIZE= 5;
    }

    public StackOfPlate(int stackSize) {
        this.STACK_SIZE = stackSize;
    }

    void push(int num) {
        if(stacks.isEmpty() || stacks.getLast().size() == STACK_SIZE) {
            Stack<Integer> stack = new Stack<>();
            stack.push(num);
            stacks.add(stack);
        } else {
            Stack<Integer> stack = stacks.getLast();
            stack.push(num);
        }
    }

    int pop() {
        if (stacks.isEmpty()) {
            throw new EmptyStackException();
        }
        Stack<Integer> lastStack = stacks.getLast();
        int value = lastStack.pop();
        removeStackIfEmpty();
        return value;
    }

    /**
     * 맨 마지막 스택이 비어있을 경우 제거
     */
    void removeStackIfEmpty() {
        if (stacks.getLast().isEmpty()) {
            stacks.removeLast();
        }
    }

    /**
     * stackIndex 위치에 있는 스택에 있는 값을 pop합니다.
     * pop한 후에 다음 스택의 맨 아래에 있는 요소를 이전 스택으로 옮겨줘야 합니다.
     * @param stackIndex
     * @return
     */
    int popAt(int stackIndex) {
        if (stacks.isEmpty()) {
            throw new EmptyStackException();
        }
        if (stackIndex < 0 || stacks.size() < stackIndex) {
            throw new IllegalArgumentException("stackIndex 범위를 초과하였습니다.");
        }
        int value = stacks.get(stackIndex).pop();
        shift(stackIndex);
        removeStackIfEmpty();
        return value;
    }

    /**
     * 각 스택의 맨 아래에 있는 요소를 이전 스택의 맨 위로 옮겨 줍니다.
     * @param stackIndex
     */
    void shift(int stackIndex) {
        for (int i = stackIndex; i < stacks.size() - 1; i++) {
            Stack<Integer> currentStack = stacks.get(i);
            Stack<Integer> nextStack = stacks.get(i + 1);
            currentStack.push(nextStack.remove(0));
        }
    }

    void printStacks() {
        stacks.forEach(System.out::print);
        System.out.println();
    }
}