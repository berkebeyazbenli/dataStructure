package question3;
//----------------------------------------------------- 
//Title:Node class
//Author: Berke/Beyazbenli
//ID: 10022751132
//Section: 3
//Assignment: 1
//Description: This class tests the question3.
//-----------------------------------------------------

public class Node {

	 int data;// The data stored in the node
	    Node next;// The reference to the next node in the linked list
	    
	    public Node(int value) {
	    	
	    	//--------------------------------------------------------
	    	// Summary: // Constructor to initialize the node with a given value and set next as null
	    	
	    	// Precondition: value is a integer
	    	//
	    	// Postcondition: data=value and next item is set null 
	    	//--------------------------------------------------------
	        this.data = value;
	        this.next = null;
	    }
	
}
