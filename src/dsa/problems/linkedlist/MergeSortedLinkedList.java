package dsa.problems.linkedlist;

/**
 * @author pramitk
 * @project dsa-problems-playground
 * @date 14/12/24
 */
public class MergeSortedLinkedList {

    public Node mergeLinkedList(Node list1, Node list2) {

        Node responseNode = new Node(-1);
        Node current = responseNode;

        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                Node node = new Node(list1.data);
                current.next = node;
                list1 = list1.next;
                current=node;
            }else if (list2.data < list1.data) {
                Node node = new Node(list2.data);
                current.next = node;
                list2 = list2.next;
                current=node;
            }
            else {
                Node node = new Node(list2.data);
                current.next = node;
                list2 = list2.next;
                current=node;
                node = new Node(list1.data);
                current.next = node;
                list1 = list1.next;
                current=node;
            }
        }
        if (list1 != null) current.next = list1;
        if (list2 != null) current.next = list2;
        return responseNode.next;
    }
}
