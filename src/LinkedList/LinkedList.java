package LinkedList;

import java.io.IOException;

public class LinkedList {

    public Node head;
    private Node tail;
    private int length;


    public LinkedList(){
        this.head=null;
        this.tail=null;
    }
//    public LinkedList(int value){
//        Node newNode = new Node(value);
//        head = newNode;
//        tail = newNode;
//        length=1;
//    }

    // LAST Append
    public void append(int value){
        Node newNode = new Node(value);
        if (length == 0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }

        length++;
    }

    // LAST Remove
    public void removeLast(){
        if (length == 0)
          System.out.println("List is empty");
        else if (head.next == null){
            System.out.println("Deleting "+head.value);
            head = null;
            length--;
            System.out.println("Deleted ");
        }else {
            Node temp = head;
            while (temp.next != tail){
                temp = temp.next;
            }
            System.out.println("Deleting "+tail.value);
            tail = temp;
            tail.next=null;
            length--;
            System.out.println("Deleted");
        }
    }

    // 1st Append
    public void prepend(int value){
        Node newNode = new Node(value);
        if (length == 0){
            head = newNode;
            tail = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    // 1st Remove
    public void removeFirst(){

        if (length == 0){
            System.out.println("List is empty");
        }else if(head.next == null){
            System.out.println("Deleting "+head.value);
            head =null;
            tail=null;
            length--;
        }else {
            System.out.println("Deleting "+head.value);
            head = head.next;
            length--;
            System.out.println("Deleted");
        }

    }

    // GET by index
    public Node getByIndex(int index){
        if(index >= length || index < 0)
            return null;

        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;

    }

    //Insert in middle
    public boolean insert(int index, int value){
        if(index >= length || index < 0)
            return false;

        if(index == 0){
            prepend(value);
            return true;
        }

        if(index == length){
            append(value);
            return true;
        }

        Node temp = getByIndex(index-1);
        Node newNode = new Node(value);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }


     /* Reverse link list
      H              T
      1  2  3  4 ->  5-> null
      */
    public Node reverse(){
        if(length == 0){
            System.out.println("List is empty");
            return head;
        }else if(head.next==null){
            System.out.println("Reversed");
            return head;
        }else{

            Node temp = head;
            head = tail;
            tail = temp;
            Node after = temp.next;
            Node before = null;
            for (int i = 0; i < length; i++) {
                after = temp.next;
                temp.next = before;
                before = temp;
                temp = after;
            }
            return head;

        }


    }


    /* Reverse link list
      H
      1 -> 2 -> 3 -> 4 -> null

      1 2 3 null
      3 2 1 null
    */
    public Node reverseUsingRecursion(Node node){
        if(node == null) {
            return node;
        }

        // last node or only one node
        if(node.next == null) {
            return node;
        }

        Node newHeadNode = reverseUsingRecursion(node.next);

        // change references for middle chain
        node.next.next = node;
        node.next = null;

        // send back new head node in every recursion
        return newHeadNode;

    }

     /* Print Linked List */
    public void printList(){
        System.out.println("----------------------------------");
        if(head == null){
            System.out.println("List is empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("----------------------------------");
    }

    public void getHead(){
        System.out.println("Head : "+head.value);
    }

    public void getTail(){
        System.out.println("Tail : "+tail.value);
    }

    public void getLength(){
        System.out.println("Length : "+length);
    }





    /* Function to print linked list */
    public static void printLinkedList(Node node,
                                             String sep) {
        while (node != null) {
            System.out.print(String.valueOf(node.value) + sep);
            node = node.next;
        }
    }

}
