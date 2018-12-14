package Test;

import Code.DoubleLinkedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DoubleLinkedListTest {

    DoubleLinkedList<Integer> dll = new DoubleLinkedList<Integer>();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void addBack() {

        dll.addBack(2);
        Assert.assertEquals( 2, (long) dll.getElement(0));

    }

    @Test
    public void addFront() {

        dll.addFront(1);
        Assert.assertEquals(1, (long) dll.getElement(0));

    }

    @Test
    public void insert() {

        dll.addFront(2);
        dll.addBack(4);
        dll.addBack(6);
        dll.insert(0,0);
        dll.insert(1,1);
        Assert.assertEquals(0, (long) dll.getElement(0));
        Assert.assertEquals(1, (long) dll.getElement(1));
    }

    @Test
    public void getElement() {

        dll.addFront(2);
        dll.addBack(4);
        dll.addBack(6);
    }

    @Test
    public void getSize() {

        dll.addFront(2);
        dll.addFront(4);
        dll.addFront(6);
        Assert.assertEquals( 3, dll.getSize());
    }

    @Test
    public void delete() {

        dll.addFront(2);
        dll.addBack(4);
        dll.addBack(6);
        dll.delete(1);
        Assert.assertEquals(6, (long) dll.getElement(1));
        Assert.assertEquals(2, dll.getSize());
    }

    @Test
    public void pop() {

        dll.addFront(2);
        dll.addBack(4);
        dll.addBack(6);
        int testint = dll.pop(1);
        Assert.assertEquals(4, testint);
        Assert.assertEquals(6, (long)dll.getElement(1));
    }

    @Test
    public void set() {

        dll.addFront(2);
        dll.addBack(4);
        dll.addBack(6);
        dll.set(4325,1);
        Assert.assertEquals(4325, (long) dll.getElement(1));
    }
}
