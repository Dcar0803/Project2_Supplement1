
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
	
	public Node(String nodeID, int data){
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
    
    /**
     * Inserts a new value into the tree. If the value is less than the current node's data,
     * it is inserted into the left child; otherwise, it is inserted into the right child.
     * 
     * @param newId The unique ID of the new node to insert.
     * @param value The data value to insert into the tree.
     */
    
    public void insert(String newId, int value) {
        if (value < this.data) {
            if (this.left == null) {
                this.left = new Node(newId, value);
            } else {
                this.left.insert(newId, value);
            }
        } else {
            if (this.right == null) {
                this.right = new Node(newId, value);
            } else {
                this.right.insert(newId, value);
            }
        }
    }//end of insert method 


}//end of Node class 
