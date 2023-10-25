package question3;
//----------------------------------------------------- 
//Title:LinkedList class
//Author: Berke/Beyazbenli
//ID: 10022751132
//Section: 3
//Assignment: 1
//Description: This class tests the question3.
//-----------------------------------------------------

public class LinkedList {

	Node head;

    public LinkedList() {
        
    	//-------------------------------------------------------- 
    	//Summary: Initialize the head node of the linked list
    	// Precondition:
    	// 
    	// Postcondition: Initialize linkedlist
    	//-------------------------------------------------------- {

        this.head = head;
    }

    
    public void insert(int data) {
        // 
    	//-------------------------------------------------------- 
    	// Summary: Create a new node with the specified data and sorting
    	
    	// Precondition: data is a int
    	// integer
    	// Postcondition: it gives data from arraylist in Main class
    	//--------------------------------------------------------

        Node newNode = new Node(data);
 
 
        // Insert the new node at the end of the linked list

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }



    public boolean isType1Matrix() {
        
        // 
    	
    	//-------------------------------------------------------- 
    	// Summary: Check if the linked list represents a Type 1 matrix
    	// 
    	// Precondition: 
    	// 
    	// Postcondition: controlling the linkedlist for matrix
    	//--------------------------------------------------------

    	Node temp = head;
       
        while (temp != null && temp.next != null && temp.next.next != null) {
           
        	if (temp.data>0 && temp.next.data > 0 && temp.next.next.data > 0) {
        		
        		if(temp.data<temp.next.data && temp.next.data < temp.next.next.data) {
        		
                return true;
        		}
            }
            temp = temp.next;
        }
        return false;
    }

    public boolean isType2Matrix() {
    	
    	//-------------------------------------------------------- 
    	// Summary: Check if the linked list represents a Type 2 matrix
    	// 
    	// Precondition: 
    	// 
    	// Postcondition: controlling the linkedlist for matrix
    	//--------------------------------------------------------

        Node temp = head;
       
        while (temp != null && temp.next != null) {
            
        	if (temp.data < 0 && temp.next.data < 0) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public boolean isType3Matrix() {
    	 // Summary: Check if the linked list represents a Type 3 matrix
        return isType1Matrix() && isType2Matrix();
    }
//    public String toString() {
//    	String result="";
//    	Node current=head;
//    	while(current.next!=null) {
//    		result+=current.data;
//    		if(current.next!=null){
//    			result+=", ";
//    		}
//    		current=current.next;
//    	}
//    	return "List: "+result;
//    	
//    }
}
