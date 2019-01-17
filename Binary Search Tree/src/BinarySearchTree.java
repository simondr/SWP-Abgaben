public class BinarySearchTree {

    private Node head = null;


    public void add(int value) {

        Node node = new Node(value);

        if (head == null) {

            head = node;
            return;
        }

        if (value > head.getValue() && head.getRight() == null) {
            head.setRight(node);
            return;
        }
        if (value < head.getValue() && head.getLeft() == null) {
            head.setLeft(node);
            return;
        }


        Node tmp = head;

        while (true) {


            if (value < tmp.getValue()) {
                if (tmp.getLeft() == null) {
                    tmp.setLeft(node);
                    break;
                }
                tmp = tmp.getLeft();
            }

            if (value > tmp.getValue()) {
                if (tmp.getRight() == null) {
                    tmp.setRight(node);
                    break;
                }
                tmp = tmp.getRight();
            }
        }
    }


    public Node search(int value) throws NodeNotFoundException {

        Node tmp = head;

        while (true) {

            if (tmp.getValue() == value)
                return tmp;

            if (value < tmp.getValue()){
                if (tmp.getLeft() == null) {
                    throw new NodeNotFoundException();
                }
                tmp = tmp.getLeft();
            }

            if (value > tmp.getValue()) {
                if (tmp.getRight() == null) {
                    throw new NodeNotFoundException();
                }
                tmp = tmp.getRight();
            }
        }

    }


    public Node searchFrom(Node startnode, int value) throws NullPointerException{


        while (true) {

            if (startnode.getValue() == value)
                return startnode;

            if (value < startnode.getValue()){
                if (startnode.getLeft() == null) {
                    return null;
                }
                startnode = startnode.getLeft();
            }

            if (value > startnode.getValue()) {
                if (startnode.getRight() == null) {
                    return null;
                }
                startnode = startnode.getRight();
            }
        }
    }


    private Node searchPrevious(int value) throws NodeIsHeadException, NodeNotFoundException{

        Node tmp = head;

        if(tmp.getValue() == value)
            throw new NodeIsHeadException();

        while (true){

            if(tmp.getLeft() != null && tmp.getLeft().getValue() == value) {
                return tmp;
            }
            if(tmp.getRight() != null && tmp.getRight().getValue() == value) {
                return tmp;
            }

            if (value < tmp.getValue()) {
                if (tmp.getLeft() == null)
                    throw new NodeNotFoundException();

                tmp = tmp.getLeft();
            }

            if(value > tmp.getValue()) {
                if (tmp.getRight() == null)
                    throw new NodeNotFoundException();

                tmp = tmp.getRight();
            }
        }
    }

    private Node searchGreatestNode(int value){

        Node startnode = null;
        try {
            startnode = search(value);
        }
        catch (NodeNotFoundException e){
            System.out.println(e.getMessage());
        }

        while (startnode.getRight() != null){

            startnode = startnode.getRight();
        }
        return startnode;
    }






    public void delete(int value) {

        Node deletenode = null;

        Node previousnode = null;
        try {
            previousnode = searchPrevious(value);
            deletenode = search(value);
        }
        catch (NodeIsHeadException e){
            System.out.println(e.getMessage());
        }
        catch (NodeNotFoundException e){
            System.out.println(e.getMessage());
        }


        //case: node is leaf
        if (deletenode.getRight() == null && deletenode.getLeft() == null){

            if(previousnode.getRight().getValue() == value)
                previousnode.setRight(null);

            if(previousnode.getLeft().getValue() == value)
                previousnode.setLeft(null);

            return;
        }


        //case one child right
        if(deletenode.getLeft() == null){
            previousnode.setRight(deletenode.getRight());
            return;
        }
        //case one child left
        if(deletenode.getRight() == null){
            previousnode.setLeft(deletenode.getLeft());
            return;
        }


        //worst case
        Node greatestnode = searchGreatestNode(deletenode.getLeft().getValue());


        deletenode = greatestnode;
        Node node = searchFrom(deletenode.getRight(), deletenode.getValue());
        delete(node.getValue());


    }

}
