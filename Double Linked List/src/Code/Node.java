package Code;

public class Node<T> {

    private T value;
    private Node next = null;
    private Node previous = null;




    //constructors
    public Node(T value) {
        this.value = value;
    }

    public Node(Node next) {
        this.next = next;
    }



    //value get & set
    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }



    //next get & set
    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
