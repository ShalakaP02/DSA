package LinkedListDoubly;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    public DoublyLinkedList(){
       this.head=null;
       this.tail=null;
    }

    // LAST Append
    public Node append(int value){
        Node newNode = new Node(value);
        if (length == 0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev= tail;
            tail = newNode;
        }

        length++;
        return  head;
    }

    // LAST Remove
    public Node LastRemove(){
        if (length == 0){
            System.out.println("List is empty");
            return head;
        } else if (head.next == null){
            System.out.println("Deleting "+head.value);
            head = null;
            tail = null;
            length--;
            System.out.println("Deleted ");
        }else {
            Node temp = tail;
            tail = temp.prev;

            System.out.println("Deleting "+temp.value);
            tail.next=null;
            temp.prev=null;
            length--;
            System.out.println("Deleted");
        }
        return  head;
    }


    // Prepend
    public Node prepend(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            tail = newNode;
        } else {

            newNode.next = head;
            head.prev = newNode;
            head = newNode;

        }
        length++;

        return head;
    }


    public void getHead(){
        System.out.println("Head : "+head.value);
    }

    public void getTail(){
        System.out.println("Tail : "+tail.value);
    }


    /* Function to print linked list */
    public static void printLinkedList(Node node,
                                       String sep) {
        System.out.println();
        while (node != null) {
            System.out.print(String.valueOf(node.value) + sep);
            node = node.next;
        }
        System.out.println();
    }
}
