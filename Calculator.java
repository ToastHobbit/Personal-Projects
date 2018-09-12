package calculator;
import java.util.Scanner;

public class Calculator {
	
	static double x, y;
	static double z;
	static String operator;
	static Scanner scan=new Scanner(System.in);
	
	//Addition
	public static double add(double x, double y) {
		z=x+y;
		return z;
	}
	//Subtraction
	public static double subtract(double x, double y) {
		z=x-y;
		return z;
	}
	//Multiplication
	public static double multiply(double x, double y) {
		z=x*y;
		return z;
	}
	//Division
	public static double divide(double x, double y) {
		z=x/y;
		return z;
	}
	//Base 10 Logarithm
	public static double log(double x) {
		z=Math.log(x);
		return z;
	}

	public static void main(String[] args) {
		
		//Asks user for operator or to end
		System.out.println("Enter an operator, or to end, type 'end'");
		operator=scan.next();
		
		
		while(!operator.equals("end")) {
			
			boolean invalid=false;
			
			//Asks user for input
			if(operator.equals("ln")) {
				System.out.println("Enter one input");
				try {
					x=Double.parseDouble(scan.next());
				}
				catch(NumberFormatException e) {
					System.out.println("Enter a valid number");
					invalid=true;
				}
			} else {
			System.out.println("Enter two inputs: ");
				try {
					x=Double.parseDouble(scan.next());
					y=Double.parseDouble(scan.next());	
				}
				catch(NumberFormatException e) {
					System.out.println("Enter a valid number");
					invalid=true;
				}
			}
			
			
			
			if(!invalid) {
			//Determines which operation to perform
				switch(operator) {
					case "+":
						System.out.println(add(x,y));
						System.out.println("Enter an operator, or to end, type 'end'");
						operator=scan.next();
						x=0;
						y=0;
						break;
					
					case "-":
						System.out.println(subtract(x,y));
						System.out.println("Enter an operator, or to end, type 'end'");
						operator=scan.next();
						x=0;
						y=0;
						break;
						
					case "*": case"x":
						System.out.println(multiply(x,y));
						System.out.println("Enter an operator, or to end, type 'end'");
						operator=scan.next();
						x=0;
						y=0;
						break;
						
					case "/":
						System.out.println(divide(x,y));
						System.out.println("Enter an operator, or to end, type 'end'");
						operator=scan.next();
						x=0;
						y=0;
						break;
						
					case "ln":
						System.out.println(log(x));
						System.out.println("Enter an operator, or to end, type 'end'");
						operator=scan.next();
						x=0;
						y=0;
						break;
						
					default:
						System.out.println("Something went wrong. Please enter a valid operator.");
						operator=scan.next();
						x=0;
						y=0;
				}
			}
		}		
	}
}
