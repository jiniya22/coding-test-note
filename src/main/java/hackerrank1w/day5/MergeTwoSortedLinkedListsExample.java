package hackerrank1w.day5;

public class MergeTwoSortedLinkedListsExample {
    public static void main(String[] args) {
        SinglyLinkedList llist1 = new SinglyLinkedList(), llist2 = new SinglyLinkedList();
        llist1.insertNode(1);
        llist1.insertNode(3);
        llist1.insertNode(4);
        llist2.insertNode(2);
        llist2.insertNode(3);

        SinglyLinkedListNode mergeList = mergeLists(llist1.head, llist2.head);
        print(mergeList);
    }

    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode head = new SinglyLinkedListNode(0);
        SinglyLinkedListNode tail = head;
        while (true) {
            if (head1 == null) {
                tail.next = head2;
                break;
            }
            if (head2 == null) {
                tail.next = head1;
                break;
            }

            if (head1.data <= head2.data) {
                tail.next = head1;
                head1 = head1.next;
            }
            else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }
        return head.next;
    }

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    static void print(SinglyLinkedListNode node) {
        while (node != null) {
            System.out.printf(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}
