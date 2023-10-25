package question1;
//----------------------------------------------------- 
	//Title:Node class
	//Author: Berke/Beyazbenli
	//ID: 10022751132
	//Section: 3
	//Assignment: 1
	//Description: This class tests the question1.
	//-----------------------------------------------------
public class Node<T> {

	protected Node<T> next;// Pointer to the next node in the linked list
	protected Object data;// Data stored in the node
	
	public Node (Object data) {
		//-------------------------------------------------------- 
		// Summary: Initializes a new Node object with the given data.

		// Precondition: data is connected the object which name is T
		// Postcondition: set data
		//--------------------------------------------------------
		this.data=data;
	}
	public Node<T> getNext(){
		//-------------------------------------------------------- 
		// Summary:  Returns the next node in the linked list
		// Precondition: 
		// Postcondition: return next
		//--------------------------------------------------------
		return next;
	}
	public void setNext(Node<T> next) {
		//-------------------------------------------------------- 
		// Summary: Sets the next node in the linked list to the given value.
		// Precondition: next is the type of generic object connect with T
		// Postcondition: set next
		//--------------------------------------------------------
		this.next=next;
	}
	public Object getData() {
		//-------------------------------------------------------- 
		// Summary: Returns the data stored in the node.
		// Precondition: 
		// Postcondition:return data
		//--------------------------------------------------------
		return data;
	}
	public void setData(Object data) {
		//-------------------------------------------------------- 
		// Summary:  Sets the data stored in the node to the given value.
		// Precondition: data is object
		// Postcondition: set data
		//--------------------------------------------------------
		this.data=data;
	}
}
