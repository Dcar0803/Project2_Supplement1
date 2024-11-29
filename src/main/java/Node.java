
public class Node {
	
	Node left;
	Node right;
	String nodeID;
	int data;
	
	/**
     * Constructs a Node with a unique ID and data value.
     * 
     * @param nodeId The unique ID of the node.
     * @param data The integer data stored in the node.
     */
	
	public Node(Node left, Node right, String nodeID, int data){
		this.left = null;
		this.right = null;
		this.nodeID = nodeID;
		this.data = data;
		
		
	}//end of Node constructor
	
	/**
     * Gets the left child of the node.
     * 
     * @return The left child node, or null if there is no left child.
     */
	
	// Getter and Setter for Left Child
    public Node getLeft() {
        return left;
    }
    
    /**
     * Sets the left child of the node.
     * 
     * @param left The node to set as the left child.
     */

    public void setLeft(Node left) {
        this.left = left;
    }
    
    /**
     * Gets the right child of the node.
     * 
     * @return The right child node, or null if there is no right child.
     */

    // Getter and Setter for Right Child
    public Node getRight() {
        return right;
    }
    
    /**
     * Sets the right child of the node.
     * 
     * @param right The node to set as the right child.
     */

    public void setRight(Node right) {
        this.right = right;
    }
    
    /**
     * Gets the unique ID of the node.
     * 
     * @return The unique ID of the node.
     */

    // Getter for Node ID
    public String getNodeId() {
        return nodeID;
    }// end of nodeID getter


    /**
     * Gets the data stored in the node.
     * 
     * @return The integer data of the node.
     */
    // Getter for Data
    public int getData() {
        return data;
    }//end of data getter


}//end of Node class 
