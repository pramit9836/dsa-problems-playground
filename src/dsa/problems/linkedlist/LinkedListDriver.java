package dsa.problems.linkedlist;

/**
 * @author pramitk
 * @project dsa-problems-playground
 * @date 24/08/24
 */
public class LinkedListDriver {
    public static void main(String[] args) {
        // Create a hard-coded linked list:
        // 1 -> 2 -> 3 -> 4 -> 5
        int i = 2;
        Node head = new Node(1);
        Node current = head;
        while (i < 6) {
            current.next = new Node(i);
            current = current.next;
            i++;
        }
        // Print the original linked list
        System.out.print("Given Linked list:");
        printList(head);

        System.out.println();
        head  = ReverseLinkedList.reverseLinkedList(head);
        System.out.print("Reversed Given Linked list:");
        printList(head);

    }

    // This function prints the contents
    // of the linked list starting from the head
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(" " + node.data);
            node = node.next;
        }
    }
}
