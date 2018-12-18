public class Main {

    public static void main(String[] args) {

        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.add(3);
        binarySearchTree.add(4);
        binarySearchTree.add(2);
        binarySearchTree.add(6);
        binarySearchTree.add(5);
        Node node = binarySearchTree.search(5);
        System.out.println(node.getValue());


    }
}
