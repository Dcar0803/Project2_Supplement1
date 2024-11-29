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
	
	@Test
    void testInsertLeft() {
        Node root = new Node("root", 10);
        root.insert("left", 5);
        assertNotNull(root.getLeft());
        assertEquals(5, root.getLeft().getData());
        assertEquals("left", root.getLeft().getNodeId());

        @Test
        void testInsertRight() {
            Node root = new Node("root", 10);
            root.insert("right", 15);
            assertNotNull(root.getRight());
            assertEquals(15, root.getRight().getData());
            assertEquals("right", root.getRight().getNodeId());
        }

        @Test
        void testInsertRecursive() {
            Node root = new Node("root", 10);
            root.insert("left", 5);
            root.insert("left-left", 3);
            assertNotNull(root.getLeft().getLeft());
            assertEquals(3, root.getLeft().getLeft().getData());
            assertEquals("left-left", root.getLeft().getLeft().getNodeId());
        }
}//end of class 
