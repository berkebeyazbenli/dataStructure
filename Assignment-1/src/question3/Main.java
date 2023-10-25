package question3;
//----------------------------------------------------- 
//Title:Tester class(main class)
//Author: Berke/Beyazbenli
//ID: 10022751132
//Section: 3
//Assignment: 1
//Description: This class tests the questio3.
//-----------------------------------------------------
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList list = new LinkedList();// create a new instance of the LinkedList class

	       Scanner scanner = new Scanner(System.in);// create a new Scanner object to read from standard input
         System.out.println("Enter the file name:"); // print a message asking the user to enter the file name
      
         String fileName = scanner.next();//read a line of input from the user.

	       
   
      
		try {
			  Scanner scan1=new Scanner(new BufferedReader(new FileReader(fileName)));//create a new Scanner object and read from the file.
		       
			 
				
			  
          while (scan1.hasNextLine()) {// while there are more lines to read from the file
          	
	            	
          
         
          	String line1=scan1.nextLine();// read the next line of text from the file and store it in a string variable called line1
          
          	String[] line=line1.split(" ");// split the line into an array of strings, using whitespace as the delimiter
              
          
          	for (int i=0;i<line.length; i++) {// for each string in the line
      		int a;// create an integer variable called a

              a=(Integer.parseInt(line[i]));// create an integer variable called a

              list.insert(a); // add the integer to the linked list
          }
	            	
	            
	            	
	            }
          
         
	            
//          System.out.println( list.toString());
	  
	     
	            
	            if (list.isType3Matrix()) {
	                System.out.println("It is a type 3 matrix.");
	            } else if (list.isType1Matrix()) {
	                System.out.println("It is a type 1 matrix.");
	            } else if (list.isType2Matrix()) {
	                System.out.println("It is a type 2 matrix.");
	            } else {
	                System.out.println("It is not one of these types");
	            }
	        } catch (Exception e) {
	           
	            e.printStackTrace();
	        }
	    }
	
     
	}


