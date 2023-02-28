package LinkedListDoubly;

public class DoublyLinkedListMain {
    public static void main(String[] args) {

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.append(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        doublyLinkedList.append(4);
        Node n1 =   doublyLinkedList.append(5);

        doublyLinkedList.printLinkedList(n1, " ");

        doublyLinkedList.getHead();
        doublyLinkedList.getTail();

//        Node n2 =   doublyLinkedList.LastRemove();
//        doublyLinkedList.printLinkedList(n2, " ");

        Node n3 =   doublyLinkedList.prepend(0);
        doublyLinkedList.printLinkedList(n3, " ");

        doublyLinkedList.getHead();
        doublyLinkedList.getTail();
    }
}
