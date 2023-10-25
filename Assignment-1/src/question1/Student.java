package question1;
//----------------------------------------------------- 
//Title:Student class
//Author: Berke/Beyazbenli
//ID: 10022751132
//Section: 3
//Assignment: 1
//Description: This class tests the question1.
//-----------------------------------------------------
public class Student {

	//-------------------------------------------------------- 
    // Summary: class variables
	// Precondition: 
	// Postcondition: 
	//--------------------------------------------------------
	

	private int Id;
	private String name;
	private double grade1;
	private double grade2;
	private	double grade3;
	protected double avg;
	
	public Student(int Id, String name, double grade1, double grade2,double grade3) {
		//-------------------------------------------------------- 
	    // Summary: constructor
		// Precondition: 
		// Postcondition: 
		//--------------------------------------------------------
		this.setId(Id);
		this.setName(name);
		this.grade1=grade1;
		this.grade2=grade2;
		this.grade3=grade3;
		this.avg=Average_grade();// set the average grade using the provided method
	}
	
	

	public double Average_grade() {
		//-------------------------------------------------------- 
	    // Summary: Method to calculate average grade
		// Precondition: 
		// Postcondition: return grades
		//--------------------------------------------------------
		return grade1*0.3 +grade2*0.2 + grade3*0.5;
		
	}

	public int getId() {
		//-------------------------------------------------------- 
	    // Summary: Getter method for Id
		// Precondition: 
		// Postcondition: return ıd
		//--------------------------------------------------------
		return Id;
	}

	public void setId(int id) {
		//-------------------------------------------------------- 
	    // Summary: Set method for id
		// Precondition: id is a integer value
		// Postcondition: set id
		//--------------------------------------------------------
		Id = id;
	}

	public String getName() {
		//-------------------------------------------------------- 
	    // Summary:Getter method for Id
		// Precondition: 
		// Postcondition: return name
		//--------------------------------------------------------
		return name;
	}

	public void setName(String name) {
		//-------------------------------------------------------- 
	    // Summary: Set method for name
		// Precondition: name is a string
		// Postcondition: set name
		//--------------------------------------------------------
		this.name = name;
	}

	public double getavg () {
		//-------------------------------------------------------- 
	    // Summary: Getter method for average
		// Precondition: 
		// Postcondition: return average
		//--------------------------------------------------------
		return avg;
	}

	public void setAvg(double avg) {
		//-------------------------------------------------------- 
	    // Summary: Set method for avg
		// Precondition: average so avg is a double variable
		// Postcondition: set avg
		//--------------------------------------------------------
		this.avg = avg;
	}
	
	public double getg1 () {
		//-------------------------------------------------------- 
	    // Summary: Getter method for grade1
		// Precondition: 
		// Postcondition: return grade 1
		//--------------------------------------------------------
		return grade1;
	}
	public double getg2 () {
		//-------------------------------------------------------- 
	    // Summary: Getter method for grade2
		// Precondition: 
		// Postcondition: return grade2
		//--------------------------------------------------------
		return grade2;
	}
	public double getg3 () {
		//-------------------------------------------------------- 
	    // Summary: Getter method for grade2
		// Precondition: 
		// Postcondition: return grade3
		//--------------------------------------------------------
		return grade3;
	}
	public String toString() {
		//-------------------------------------------------------- 
	    // Summary: Method to display student information
		// Precondition: 
		// Postcondition: 
		//--------------------------------------------------------
		return (name + "'s ID is " + Id + ". His grades are " + grade1 + ", " + grade2 + " and " + grade3 + ".");
}
	
}
