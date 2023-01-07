package tree.traversal;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeTraversalExample {

    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.insert(1);
        binaryTree.insert(2);
        binaryTree.insert(3);
        binaryTree.insert(4);
        binaryTree.insert(5);
        binaryTree.insert(6);

//        System.out.println("\t:: BFS (= Level order) ::");
//        binaryTree.print(BinaryTree.TraversalOrder.LEVEL);

//        System.out.println("\n\t:: DFS - pre order ::");
//        binaryTree.print(BinaryTree.TraversalOrder.PRE);

        System.out.println("\n\t:: DFS - in order ::");
        binaryTree.print(BinaryTree.TraversalOrder.IN);

//        System.out.println("\n\t:: DFS - post order ::");
//        binaryTree.print(BinaryTree.TraversalOrder.POST);
    }

}

class BinaryTree<T> {
    private int nodeCount;
    private Node root = null;


    public class Node {
        private Node left;
        private Node right;
        private final T element;

        public Node(T element) {
            this.element = element;
        }

        public Node(Node left, Node right, T element) {
            this.left = left;
            this.right = right;
            this.element = element;
        }
    }

    public boolean insert(T element) {
        if (element == null) {
            return false;
        }
        if (root == null) {
            root = new Node(element);
            nodeCount++;
            return true;
        }
        insert(root, element);
        return true;
    }

    private void insert(Node node, T element) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            node = queue.peek();
            queue.poll();
            if (node.left == null) {
                node.left = new Node(element);
                nodeCount++;
                break;
            } else {
                queue.add(node.left);
            }
            if (node.right == null) {
                node.right = new Node(element);
                nodeCount++;
                break;
            } else {
                queue.add(node.right);
            }
        }
    }

    enum TraversalOrder {
        LEVEL,
        PRE,
        IN,
        POST
    }

    /**
     * BFS, 레벨순위
     * @param node
     */
    private void printLevelOrder(Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(" " + current.element);
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

    private void printPreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.element);
            printPreOrder(node.left);
            printPreOrder(node.right);
        }
    }

    private void printInOrder(Node node) {
        if (node != null) {
            printInOrder(node.left);
            System.out.print(" " + node.element);
            printInOrder(node.right);
        }
    }

    private void printPostOrder(Node node) {
        if (node != null) {
            printPostOrder(node.left);
            printPostOrder(node.right);
            System.out.print(" " + node.element);
        }
    }

    public void print(TraversalOrder traversalOrder) {
        if (size() == 0) {
            System.out.println("tree is empty");
            return;
        }
        switch (traversalOrder) {
            case LEVEL -> printLevelOrder(root);
            case PRE -> printPreOrder(root);
            case IN -> printInOrder(root);
            case POST -> printPostOrder(root);
            default -> throw new IllegalArgumentException("순회 방법을 인식할 수 없습니다.");
        }
    }

    private int size() {
        return nodeCount;
    }
}