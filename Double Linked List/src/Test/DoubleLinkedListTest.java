package Test;

import Code.DoubleLinkedList;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class DoubleLinkedListTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(Code.DoubleLinkedList.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void addBack() {
        DoubleLinkedList<Integer> dll = new DoubleLinkedList<Integer>();
        dll.addBack(2);
        
    }

    @Test
    public void addFront() {

    }

    @Test
    public void insert() {
    }

    @Test
    public void getElement() {
    }

    @Test
    public void getSize() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void pop() {
    }

    @Test
    public void set() {
    }
}
