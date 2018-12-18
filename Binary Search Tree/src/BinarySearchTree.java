public class BinarySearchTree {

    private Node head = null;


    public void add(int value){

        Node node = new Node(value);
        if(head == null) {
            head = node;
            return;
        }

        if(value > head.getValue() && head.getLeft() == null){
            head.setLeft(node);
            return;
        }
        if(value < head.getValue() && head.getRight() == null){
            head.setRight(node);
            return;
        }


        Node nextnode = head;
        while (nextnode != null){

            if(nextnode.getValue() < value) {
                if(nextnode.getLeft() == null) {
                    nextnode.setLeft(node);
                    return;
                }
                else
                    nextnode = nextnode.getLeft();
            }
            if(nextnode.getValue() > value){
                if(nextnode.getRight() == null) {
                    nextnode.setRight(node);
                    return;
                }
                else
                    nextnode = nextnode.getRight();
            }
        }
    }

    public Node search(int value) throws NodeNotFoundException{

        Node tmp = head;
        while (value != tmp.getValue()){

            if(tmp.getValue() < value) {
                if (tmp.getLeft() == null)
                    break;
                else
                    tmp = tmp.getLeft();
            }
            if(tmp.getValue() > value) {
                if (tmp.getRight() == null)
                    break;
                else
                    tmp = tmp.getRight();
            }
        }

        if(tmp.getValue() == value)
            return tmp;
        else
            throw new NodeNotFoundException();
    }

}
