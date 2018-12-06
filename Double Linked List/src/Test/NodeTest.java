package Test;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class NodeTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(Code.Node.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.Test
    public void getValue() {
    }

    @org.junit.Test
    public void setValue() {
    }

    @org.junit.Test
    public void getNext() {
    }

    @org.junit.Test
    public void setNext() {
    }

    @org.junit.Test
    public void getPrevious() {
    }

    @org.junit.Test
    public void setPrevious() {
    }
}
