//----------------------------------------------------- 
	//Title:LinkedList class
	//Author: Berke/Beyazbenli
	//ID: 10022751132
	//Section: 3
	//Assignment: 1
	//Description: This class about linkedList
	//-----------------------------------------------------
package question1;

public class LinkedList<T> {

Node<T> head;
	
	int size;
	 public LinkedList() {
		//-------------------------------------------------------- 
		// Summary: Initializes a new LinkedList object with an empty head and size of 0.

		// Precondition: 
		// Postcondition: set head null and size equals the 0 
		//--------------------------------------------------------
	        this.head = null;
	        this.size = 0;
	    }
	  public Node<T> getHead() {
	        return head;
	    }
	  
	  public void add(T data) {
		//-------------------------------------------------------- 
			// Summary: Creates a new node with the given data and adds it to the end of the list.
			// Precondition: data is connected the object which name is T
			// Postcondition: at the same increase the size of list
			//--------------------------------------------------------
	        Node<T> newNode = new Node<T>(data);
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node<T> current = head;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = newNode;
	        }
	        size++;
	    }
	  public void delete(T data) {
		//-------------------------------------------------------- 
			// Summary:Removes the first node with the given data from the list. 
			// Precondition: data is connected the object which name is T
			// Postcondition: The value of the variable is set. 
			//--------------------------------------------------------
	        if (head == null) {
	            return;
	        }
	        if (head.data.equals(data)) {
	            head = head.next;
	            size--;
	            return;
	        }
	        Node<T> current = head;
	        while (current.next != null && !current.next.data.equals(data)) {
	            current = current.next;
	        }
	        if (current.next != null) {
	            current.next = current.next.next;
	            size--;
	        }
	        
	    }
	  public int size() {
		// Returns the size of the list
	        return size;
	    }

	    public boolean isEmpty() {
	    	// Returns true if the list is empty, false otherwise
	        return size == 0;
	    }

	    public int indexOf(Object obj) {
	    	//-------------------------------------------------------- 
			// Summary: Returns the index of the first occurrence of the given object in the list,
			//          or -1 if not found.

			// Precondition: parameter is the obj feom object
			// Postcondition: we have to know index of linkedList for finding items.pop() 
			//--------------------------------------------------------
	        Node<T> current = head;
	        for (int i = 0; i < size; i++) {
	            if (current.data.equals(obj)) {
	                return i;
	            }
	            current = current.next;
	        }
	        return -1;
	    }
}
