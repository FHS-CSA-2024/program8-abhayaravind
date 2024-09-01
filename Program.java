//import stuff here

//Your code here
import java.util.Scanner;
import java.lang.Math; //This imports the console scanner that reads user input

//Your code here:

public class Program8{

public static void main (String[] args) {
	
	int num1 = 0;
	int num2 = 2;
	
	Scanner numScanner = new Scanner(System.in);
	
	System.out.println("Enter number 1:");
		num1 = numScanner.nextInt();
		
	System.out.print("Enter number 2:");
		num2 = numScanner.nextInt();
		
	int sum = num1 + num2;
	int difference = num1 - num2;
	int product = num1 * num2;
	double avg = (double) sum/2;
	int absoluteValue = Math.abs(difference);	
	int max = (Math.abs(difference)+sum)/2;
	int min = (Math.abs(sum)-Math.abs(difference))/2;
	
	System.out.println("Sum = " + sum);
	System.out.println("Difference = " + difference);
	System.out.println("Product = " + product);
	System.out.println("Average = " + avg);
	System.out.println("Absolute Value = " + absoluteValue);
	System.out.println("Max = " + max);
	System.out.println("Min = " + min);
	}	

}

//Paste console output below:
/*

Enter number 1:
13
Enter number 2:20
Sum = 33
Difference = -7
Product = 260
Average = 16.5
Absolute Value = 7
Max = 20
Min = 13

*/
