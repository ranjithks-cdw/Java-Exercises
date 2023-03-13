package exercise1;

/*
 * Program to calculate marks of Student
 */
public class School {

	public static void main(String[] args) {
		Result resObj = new Result("Ranjith","19CSR153",90,95,88);
		resObj.displayDetails();
	}

}

class Student {
	//	Members
	public String name;
	public String rollNumber;
	
	//	Constructor
	public Student(String name,String rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
	}
	public void displayDetails() {
		System.out.println("Name: "+ this.name);
		System.out.println("Roll Number: "+ this.rollNumber);
	}
}

class Exam extends Student {
	//	Members
	public int[] marks;

	//	Constructor
	public Exam(String name,String rollNumber,int... marks) {
		super(name,rollNumber);
		this.marks = new int[marks.length];
		for(int i=0;i<marks.length;i++)
			this.marks[i] = marks[i];
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Marks of each subject: ");
		for(int i: this.marks)
			System.out.print(i+" ");
		System.out.println();
	}
}

class Result extends Exam {
	//	Members
	public int totalMark;
	
	//	Constructor
	public Result(String name,String rollNumber,int subject1,int subject2,int subject3) {
		super(name,rollNumber,subject1,subject2,subject3);
		this.totalMark = 0;
	}
	
	// Method to calculate total mark
	private void calculateTotalMark() {
		 for(int mark: this.marks)
			 this.totalMark += mark;
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		this.calculateTotalMark();
		System.out.println("Total Marks: "+ this.totalMark);
	}
}