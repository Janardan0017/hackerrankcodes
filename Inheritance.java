package hackerrank;

import java.util.Scanner;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;

    
    Student(String firstName, String lastName, int id, int[] scores){
    	super(firstName, lastName, id);
    	this.testScores = scores;
    }
    	
   public char calculate() {
//	   this.testScores = testScores;
	   int avg = 0;
   	for(int a : testScores) {
   		avg = avg + a;
   	}
   	avg = avg/testScores.length;
   if(avg >= 90 && avg <= 100)
	   return 'O';
   else if(avg >= 80 && avg < 90)
	   return 'E';
   else if(avg >= 70 && avg < 80)
	   return 'A';
   else if(avg >= 55 && avg < 70)
	   return 'P';
   else if(avg >= 40 && avg < 55)
	   return 'D';
   else if(avg < 40)
	   return 'T';
return 0;
   }
   }

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner scan = new Scanner(System.in);
			String firstName = scan.next();
			String lastName = scan.next();
			int id = scan.nextInt();
			int numScores = scan.nextInt();
			int[] testScores = new int[numScores];
			for(int i = 0; i < numScores; i++){
				testScores[i] = scan.nextInt();
			}
			scan.close();
			
			Student s = new Student(firstName, lastName, id, testScores);
			s.printPerson();
			System.out.println("Grade: " + s.calculate() );
		}
	}