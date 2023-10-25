package question1;
//----------------------------------------------------- 
//Title:Stack class
//Author: Berke/Beyazbenli
//ID: 10022751132
//Section: 3
//Assignment: 1
//Description: This class tests the question1.
//-----------------------------------------------------

public class Stack<T> {

	private Node<T> top;// Pointer to the top node of the stack
	private int size;// Number of elements currently in the stack
	
	public void push(T data) {
		//-------------------------------------------------------- 
		// Summary: Creates a new node with the given data and adds it to the end of the list.
		// Precondition: data is connected the object which name is T
		// Postcondition: at the same increase the size of list
		//--------------------------------------------------------
		Node<T> newNode=new Node<>(data);
		newNode.next=top;
		top=newNode;
		size++;
	}

	public Object pop() {
		//-------------------------------------------------------- 
		// Summary: Creates a new node with the given data and adds it to the top of the stack.
		// Precondition: 
		// Postcondition: for adding item in stack
		//--------------------------------------------------------
		if(top==null) {
			System.out.println("...");
		}
		Object data=top.data;
		top=top.next;
		size--;
		return data;
	}
	
	
	public Object peek() {
		//-------------------------------------------------------- 
		// Summary: Displays an error message if the stack is empty.
		// Precondition: 
		// Postcondition: error
		//--------------------------------------------------------
		if(top==null) {
			System.out.println("...");
		}
	
		return top.data;
		
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	public int getSize() {
		//summary: getting fot the size of stack
		return size;
	}
	
	public Object get(int index) {
		//-------------------------------------------------------- 
		// Summary: Returns the element at the specified index, counting from the top of the stack
		// Precondition: index is a int value
		// Postcondition: we have to know index of elements for removing
		//--------------------------------------------------------
		
		Node<T> current=top;
		
		for(int i=0;i<index;i++) {
			current=current.next;
		}
		return current.data;
		}
		
	
}
