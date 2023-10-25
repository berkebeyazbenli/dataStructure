package question1;

import java.util.Scanner;
//----------------------------------------------------- 
//Title:tester class main class
//Author: Berke/Beyazbenli
//ID: 10022751132
//Section: 3
//Assignment: 1
//Description: This class tests the question1.
//-----------------------------------------------------

public class Main {

	public static void main(String[] args) {
		  LinkedList<Student> LinkedList = new LinkedList<>();// Create a linked list to hold the students

			Stack<Student> Stack = new Stack<>();// Create a stack to hold the students in reverse order of creation

			
			Scanner scan=new Scanner(System.in);        // Create a scanner to read user input

			
			
			int option=6;// Initialize the option variable to 6, so the program will enter the loop
		
			
			do{     // Display the menu
				System.out.println("Choose an option:");
				System.out.println("1) Create a student:");
				System.out.println("2) Remove a student:");
				System.out.println("3) Summarize all students:");
				System.out.println("4) Exit:");
				
				option=scan.nextInt();
				
			
			
			if(option==1) {
				System.out.println("Enter the ID of the student.");
	            int Id = scan.nextInt();
	            System.out.println("Enter the name of the student.");
	            String name = scan.next();
	            System.out.println("Enter the grade1 of the student.");
	            double grade1 = scan.nextDouble();
	            System.out.println("Enter the grade2 of the student.");
	            double grade2 = scan.nextDouble();
	            System.out.println("Enter the grade3 of the student.");
	            double grade3 = scan.nextDouble();
				
				Student student=new Student(Id, name, grade1, grade2, grade3);
				Stack.push(student); // Push the student onto the stack
	            LinkedList.add(student); // Add the student to the linked list
	            Node<Student> current = LinkedList.getHead();
	            while (current != null) {
	                
	            	 // Sort the linked list by average grade, with the highest first
	            	Node<Student> currenNext = current.next;
	               
	                while (currenNext != null) {
	                    Student s1 = (Student) current.getData();
	                    Student s2 = (Student) currenNext.getData();
	                    if (s1.avg<s2.avg) {
	                        Student temp = (Student) current.data;
	                        current.data = currenNext.data;
	                        currenNext.data = temp;
	                    }
	                    currenNext = currenNext.next;
	                }
	                current = current.next;
	            }
		}
			
			
			if(option==2) {
				Student removedStudent = (Student) Stack.pop();
	            System.out.println(removedStudent.getName() + "'s ID was " + removedStudent.getId() + ". His grades were "+ removedStudent.getg1() + ", " + removedStudent.getg2() + " and " + removedStudent.getg3()+ ". He was ranked " + ((LinkedList).indexOf(removedStudent) + 1)+ " in the class.");
	            LinkedList.delete(removedStudent);
			}
			
			
			if(option==3) {
				
				for (int i = 0; i < Stack.getSize(); i++) {
	                Student student = (Student) Stack.get(i);
	                System.out.println(student.toString() + " He is ranked " + (LinkedList.indexOf(student) + 1)+ " in the class.");
			}
				
			}	
			if(option==4) {
				for (int i = 0; i < Stack.getSize(); i++) {
	                Student student = (Student) Stack.get(i);
	                System.out.println(student.toString() + " He is ranked " + (LinkedList.indexOf(student) + 1)+ " in the class.");
	                
	                System.exit(0);
			}
			}
			}while(option!=6);
			
			
			
			
			
			
			
			
			
			
			}		

	}


