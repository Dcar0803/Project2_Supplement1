
public class Node {
	
	Node left;
	Node right;
	String nodeID;
	int data;
	
	public Node(Node left, Node right, String nodeID, int data){
		this.left = null;
		this.right = null;
		this.nodeID = nodeID;
		this.data = data;
		
		
	}//end of Node constructor
	
	// Getter and Setter for Left Child
    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    // Getter and Setter for Right Child
    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    // Getter for Node ID
    public String getNodeId() {
        return nodeID;
    }// end of nodeID getter

    // Getter for Data
    public int getData() {
        return data;
    }//end of data getter


}//end of Node class 
