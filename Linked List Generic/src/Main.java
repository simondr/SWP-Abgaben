

public class Main {

    public static void main(String[] args) {
/*
        GenericLinkedList<Integer> ll = new GenericLinkedList();
        ll.add(10);
        System.out.println("10 added");
        ll.add(110);
        System.out.println("110 added") ;
        ll.add(12);
        System.out.println("12 added");
        System.out.println();

        System.out.println("size: " + ll.getSize());
        System.out.println();

        System.out.println(ll);
        ll.delete(1);
        System.out.println("deleted element at index 1");
        System.out.println(ll);
        System.out.println();

        System.out.println(ll);
        ll.insert(141,1);
        System.out.println("141 added at index 1");
        System.out.println(ll);
        System.out.println();


        GenericLinkedList linkedList = new GenericLinkedList();
        System.out.println("empty list size: " + linkedList.getSize());


        //System.out.println(ll.getElement(2));
*/
        GenericLinkedList<String> gll = new GenericLinkedList<String>();
        gll.add("servas");
        gll.add("adsgff");
        System.out.println(gll.getSize());
        gll.insert("dsgad",0);
        System.out.println(gll);
        gll.delete(1);
        System.out.println(gll);
    }
}
