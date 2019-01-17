public class Node {

    private int value;
    private Node left = null;
    private Node right = null;


    //constructors
    public Node(int value) {
        this.value = value;
    }


    //value get
    public int getValue() {
        return value;
    }


    //getter left/right
    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }


    //setter left/right
    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
