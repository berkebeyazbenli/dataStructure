package question2;

import java.util.Scanner;

public class Main {
	public static boolean isPalindrome(String string) {
        Stack stack = new Stack();// Create a new Stack object to store the characters in the input String in reverse order
        Queue queue = new Queue(string.length());// Create a new Queue object to store the characters in the input String in the original order

        for (int i = 0; i < string.length(); i++) {// Loop through each character in the input String
            char a = string.charAt(i);// Get the current character
            stack.push(a);// Push the current character onto the stack
            queue.enqueue(a);// Enqueue the current character into the queue
        }

        while (!stack.isEmpty() && !queue.isEmpty()) {// Loop while the stack is not empty
        	// Compare the characters at the top of the stack and the front of the queu
        	char a1 = stack.pop();
            char a2 = queue.dequeue();
            if (a1 != a2) {
                return false;
            }
        }
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Create a new Scanner object to read user input


        System.out.println("Enter a string: ");
        String input = scanner.nextLine();// Read the user's input and store it in a String variable

        boolean isPalindrome = isPalindrome(input);// Call the method isPalindrome from to check if the inputString is a palindrome



        if (isPalindrome) {
            System.out.println("It is a "+  "palindrome string");//if its palindrom
        } else {
            System.out.println("It"+ " is not a palindrome string");//if is  not a palindrom
		
        }
	

}
		

	}


