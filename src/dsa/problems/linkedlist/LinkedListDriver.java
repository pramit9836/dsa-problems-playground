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
        /*int i = 2;
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
        head  = ReverseLinkedList.reverseLinkedListRecursively(head);
        System.out.println();
        System.out.print("Reversed Given Linked list:");
        printList(head);*/

        Node list1 = new Node(1);
        Node list12 = new Node(3);
        list1.next = list12;
        Node list13 = new Node(7);
        list12.next = list13;
        System.out.print("List1: ");printList(list1);

        Node list2 = new Node(1);
        Node list22 = new Node(4);
        list2.next = list22;
        Node list23 = new Node(6);
        list22.next = list23;
        Node list24 = new Node(9);
        list23.next = list24;
        System.out.print("List2: ");printList(list2);

        Node result = new MergeSortedLinkedList().mergeLinkedList(list1, list2);
        System.out.print("Merged List: ");printList(result);

        Node nThNodeDeleteResult = new DeleteNthNodeFromLast().deleteNthNodeFromLast(list2, 3);
        System.out.print("List2 after deleting 3rd node from last: ");printList(nThNodeDeleteResult);

    }

    // This function prints the contents
    // of the linked list starting from the head
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(" " + node.data);
            node = node.next;
        }
        System.out.println();
    }
}
