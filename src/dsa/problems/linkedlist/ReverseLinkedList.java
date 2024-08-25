package dsa.problems.linkedlist;

/**
 * @author pramitk
 * @project dsa-problems-playground
 * @date 24/08/24
 */
public class ReverseLinkedList {

    public static Node reverseLinkedList(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node prev = head;
        Node current = head.next;
        Node nextNode = current.next;
        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;

        }
        head.next = null;
        head = prev;
        return head;
    }
}
