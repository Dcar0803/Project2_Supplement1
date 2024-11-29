import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NodeTest {

	@Test
    void testNodeCreation() {
        Node node = new Node("root", 10);
        assertEquals("root", node.getNodeId());
        assertEquals(10, node.getData());
        assertNull(node.getLeft());
        assertNull(node.getRight());
    }
}//end of class 
