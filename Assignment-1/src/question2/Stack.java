package question2;
//----------------------------------------------------- 
//Title:Stack class
//Author: Berke/Beyazbenli
//ID: 10022751132
//Section: 3
//Assignment: 1
//Description: This class tests the question2.
//-----------------------------------------------------

public class Stack {

	private Node top;// Create a new node variable to represent the top of the stack

    public void push(char c) {
    	//-------------------------------------------------------- 
    	// Summary: Method to add a new node to the top of the stack

    	// Precondition: data is a char like a letter
    	
    	// Postcondition: set data and add next data.
    	//--------------------------------------------------------
        Node newNode = new Node();
        newNode.data = c;
        newNode.next = top;
        top = newNode;
    }

    public char pop() {
    	//-------------------------------------------------------- 
    	// Summary: Method to remove and return the top node from the stack

    	// Precondition: 
    	
    	// Postcondition:remove and return
    	//--------------------------------------------------------
        if (top == null) {
            throw new RuntimeException("Stack is empty");
        }
        char c = top.data;
        top = top.next;
        return c;
    }

    public boolean isEmpty() {
    	// Summary:  Method to check if the stack is empty

    	// Precondition: 
    	
    	// Postcondition: s
    	//--------------------------------------------------------
        return top == null;
    }

}
