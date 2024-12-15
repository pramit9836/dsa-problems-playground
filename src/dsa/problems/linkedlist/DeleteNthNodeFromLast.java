package dsa.problems.linkedlist;

/**
 * @author pramitk
 * @project dsa-problems-playground
 * @date 15/12/24
 */
public class DeleteNthNodeFromLast {

    public Node deleteNthNodeFromLast(Node node, int n) {
        Node head = node;
        int length = 0;
        while (node != null) {
            length++;
            node = node.next;
        }
        if (length > 0 && length < n) {
            return null;
        }
        Node current = head;
        Node prev = head;
        int deletionPoint = length - n + 1;
        for (int i = 1; current != null ; i++) {
            if (i == deletionPoint) {
                prev.next = current.next;
                break;
            } else {
                prev = current;
                current = current.next;
            }
        }
        return head;
    }
}
