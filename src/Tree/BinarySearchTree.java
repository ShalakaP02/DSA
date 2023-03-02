package Tree;

public class BinarySearchTree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public  BinarySearchTree(){
        this.root = null;
    }

    //Insert
    public Node insert(int val){
        Node newNode = new Node(val);
        if(root == null){
            root = newNode;
            return root;
        }
        Node temp = root;
        while(true){
            if(newNode.value == temp.value){ return root; }
            if(newNode.value < temp.value){
                if(temp.left == null){
                    temp.left = newNode;
                    return root;
                }
                temp = temp.left;
            }else  if(newNode.value > temp.value){
                if(temp.right == null){
                    temp.right = newNode;
                    return root;
                }
                temp = temp.right;
            }


        }

    }

//    //Print
//    public void print(Node root){
//        if(root == null){ System.out.print(" Tree is Empty"); }
//        Node temp =root;
//
//        // Left
//        while(true){
//
//            if (temp != null) {
//                System.out.print(temp.value + " ");
//            }else {
//                break;
//            }
//            temp = temp.left;
//
//        }
//
//        temp =root;
//        // right
//        while(true){
//
//            if (temp != null) {
//                System.out.print(temp.value+ " ");
//            }else {
//                break;
//            }
//            temp = temp.right;
//
//        }
//
//
//
//    }

}
