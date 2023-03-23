package LinkedList;

public class LinkListMain {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();



        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

//        linkedList.getHead();
//        linkedList.getTail();
        linkedList.getLength();
//        linkedList.printList();


//        linkedList.removeLast();
//        linkedList.printList();

//        linkedList.prepend(0);
//        linkedList.printList();
//
//        linkedList.removeFirst();
//        linkedList.printList();

//        System.out.println(linkedList.getByIndex(1).value);

//        linkedList.insert(2,5);
//        linkedList.printList();

        linkedList.reverse();
        linkedList.printList();


//          Node llist1 = linkedList.reverseUsingRecursion(linkedList.head);
//          linkedList.printLinkedList(llist1, " ");

    }
}
