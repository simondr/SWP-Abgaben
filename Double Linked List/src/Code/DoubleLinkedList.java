package Code;

public class DoubleLinkedList<T> {

    private Node head = null;
    private Node tail = null;


    public DoubleLinkedList() {
    }


    public void addBack(T value) {

        //creating node that is to be added to the list
        Node node = new Node(value);


        //list is empty
        if (tail == null) {
            tail = node;
            head = tail;
            return;
        }
        //list not empty
        else {
            Node oldtail = tail;
            tail = node;
            oldtail.setNext(node);
            node.setPrevious(oldtail);
        }
    }

    public void addFront(T value) {

        //creating node that is to be added to the list
        Node node = new Node(value);

        if (head == null) {
            head = node;
            tail = head;
            return;

        } else {
            Node oldhead = head;
            head = node;
            oldhead.setPrevious(head);
            node.setNext(oldhead);
        }


    }

    public void insert(T value, int index) {


        Node previous = head;
        Node past = head;
        Node node = new Node(value);

        if (index == 0) {

            Node oldhead = head;
            head = node;
            oldhead.setPrevious(node);
            node.setNext(oldhead);
            return;

        }

        if (index == getSize()-1) {

            Node oldtail = tail;
            tail = node;
            oldtail.setNext(node);
            node.setPrevious(oldtail);
            return;

        }

        if (index >= (getSize() / 2)) {

            for (int i = 0; i < index - 1; i++) {
                previous = previous.getNext();
            }

            past = previous.getNext();
            previous.setNext(node);
            node.setNext(past);
            node.setPrevious(previous);
            past.setPrevious(node);

        } else {

            for (int i = getSize() - 1; i > index + 1; i--) {
                past = past.getPrevious();
            }

            previous = past.getPrevious();
            previous.setNext(node);
            node.setNext(past);
            node.setPrevious(previous);
            past.setPrevious(node);

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

        if (index == 0) {

            head = head.getNext();
            head.setPrevious(null);
            return;
        }
        if (index == (getSize() - 1)) {

            tail = tail.getPrevious();
            tail.setNext(null);
            return;

        }

        if (index >= getSize() / 2) {

            Node tmp = tail;
            for (int i = getSize()-1; i > index; i--) {
                tmp = tmp.getPrevious();
            }
            tmp.getNext().setPrevious(tmp.getPrevious());
            tmp.getPrevious().setNext(tmp.getNext());

        }
        else {

            Node tmp = head;
            for (int i = 0; i < index; i++) {
                tmp = tmp.getNext();
            }
            tmp.getNext().setPrevious(tmp.getPrevious());
            tmp.getPrevious().setNext(tmp.getNext());
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

        T tmp = getElement(index);
        delete(index);
        return tmp;
    }

    public void set(T value, int index) {

        insert(value, index);
        delete(index + 1);
    }
}

