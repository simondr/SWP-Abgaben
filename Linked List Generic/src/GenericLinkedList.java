

public class GenericLinkedList<T> {

    private Node head = null;


    public GenericLinkedList() {
    }


    public void add(T value) {

        //creating node that is to be added to the list
        Node node = new Node(value);


        //list is empty
        if (head == null) {
            head = node;
            return;
        }

        //list has 1 element
        if (head.getNext() == null) {
            head.setNext(node);
            return;
        }


        //adding node to the end of the list
        Node tmp = head;
        while (tmp.getNext() != null) {
            tmp = tmp.getNext();

        }
        tmp.setNext(node);
    }

    public void insert(T value, int index) {

        Node previous = head;
        Node past = head;
        Node node = new Node(value);
        if (index != 0) {

            for (int i = 0; i < index - 1; i++) {
                previous = previous.getNext();
            }


            for (int i = 0; i < index; i++) {
                past = past.getNext();
            }

            previous.setNext(node);
            node.setNext(past);

        } else {

            head = node;
            head.setNext(previous);

        }

    }


    public T getElement(int index) {

        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.getNext();
        }
        return (T) tmp.getValue();
    }

    public int getSize() {

        Node tmp = head;
        if (tmp == null)
            return 0;
        int counter = 1;
        while (tmp.getNext() != null) {
            tmp = tmp.getNext();
            counter++;
        }
        return counter;
    }

    public void delete(int index) {

        Node previous = head;
        Node past;

        if(index == 0) {

            head=head.getNext();
        }

        else if (index == (getSize()-1))
        {
            for (int i = 0; i < index - 1; i++) {
                previous = previous.getNext();
            }
            previous.setNext(null);
        }
        else {

            for (int i = 0; i < index - 1; i++) {
                previous = previous.getNext();
            }

            past = previous.getNext().getNext();
            previous.setNext(past);

        }
    }

    @Override
    public String toString() {
        Node tmp = head;
        String s = "";
        s += tmp.getValue() + " ";

        while (tmp.getNext() != null) {
            tmp = tmp.getNext();
            s += tmp.getValue() + " ";
        }
        return s;
    }

    public T pop(int index) {

        T tmp = getElement(0);
        delete(index);
        return getElement(index);
    }

    public void set(T value, int index) {

        insert(value, index);
        delete(index + 1);
    }
}

