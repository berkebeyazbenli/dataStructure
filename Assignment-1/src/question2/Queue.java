package question2;
//----------------------------------------------------- 
//Title:Queue class
//Author: Berke/Beyazbenli
//ID: 10022751132
//Section: 3
//Assignment: 1
//Description: This class tests the question2.
//-----------------------------------------------------

public class Queue {

	private char[] arr;
    private int front;
    private int back;

    public Queue(int size) {// Constructor that creates a new Queue object with a given size
        arr = new char[size];// Initialize the arr array to the given size
        front = 0;// Set the front index to the beginning of the array
        back = -1;// Set the back index to -1 to indicate that the queue is currently empty
    }

    public void enqueue(char a) {// Method to add a new element to the back of the queue
        if (back == arr.length - 1) {// Check if the queue is already full
            throw new RuntimeException("Queue is full");
        }
        back++;// Increasment the back index and add the new element to the back of the queue
        arr[back] = a;
    }

    public char dequeue() {// Method to remove and return the element at the front of the queue
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        char a = arr[front];
        front++;
        return a;
    }

    public boolean isEmpty() {// Remove the element at the front of the queue and return it
        return front > back;
    }

}
