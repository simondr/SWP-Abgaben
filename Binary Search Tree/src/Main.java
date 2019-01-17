public class Main {

    public static void main(String[] args) {

        BinarySearchTree binarySearchTree = new BinarySearchTree();


        /*binarySearchTree.add(3);
        binarySearchTree.add(4);
        binarySearchTree.add(2);
        binarySearchTree.add(6);
        binarySearchTree.add(5);
        binarySearchTree.add(3453);


        //Node node = binarySearchTree.searchGreatestNode(6);
        //System.out.println(node.getValue());

        /*try {
            Node node = binarySearchTree.search(3453);
            System.out.println(node.getValue());
            System.out.println(node);
        }
        catch (NodeNotFoundException e){
            System.out.println(e.getMessage());
        }*/


        /*try {
            Node node = binarySearchTree.searchPrevious(3453);
            System.out.println(node.getValue());
            System.out.println(node);
        }
        catch (NodeIsHeadException e){
            System.out.println(e.getMessage());
        }
        catch (NodeNotFoundException e){
            System.out.println(e.getMessage());
        }*/

        //binarySearchTree.delete(5);
        /*try {
            Node node = binarySearchTree.search(5);
            System.out.println(node.getValue());
            System.out.println(node);
        }
        catch (NodeNotFoundException e){
            System.out.println(e.getMessage());
        }

        binarySearchTree.delete(6);
        try {
            Node node = binarySearchTree.search(3);
            System.out.println(node.getValue());
            System.out.println(node);
        }
        catch (NodeNotFoundException e){
            System.out.println(e.getMessage());
        }
        */


        binarySearchTree.add(10);
        binarySearchTree.add(30);
        binarySearchTree.add(40);
        binarySearchTree.add(50);
        binarySearchTree.add(100);
        binarySearchTree.add(36);
        binarySearchTree.add(34);
        binarySearchTree.add(33);
        binarySearchTree.add(35);
        binarySearchTree.add(38);
        binarySearchTree.add(37);
        binarySearchTree.add(39);

        binarySearchTree.delete(40);

        try {
            Node node = binarySearchTree.search(40);
            System.out.println(node.getValue());
            System.out.println(node);
        }
        catch (NodeNotFoundException e){
            System.out.println(e.getMessage());
        }

        try {
            Node node = binarySearchTree.search(3);
            System.out.println(node.getValue());
            System.out.println(node);
        }
        catch (NodeNotFoundException e){
            System.out.println(e.getMessage());
        }

    }
}
