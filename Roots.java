package lab9;

import static java.lang.Math.*;

import java.util.*;

public class Roots {
	
	public static void main(String[] args) {
		System.out.println("I find roots to quadratic polynomials");
		boolean done = false;
		while(!done) {
			try {
				rootInput();
				done = true;
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			} catch (InputMismatchException e) {
				System.out.println("I need numbers; please try again.");
			}
		}
		
		System.out.println("Goodbye.");
	}
	
	public static void rootInput() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a, b, and c: ");
		double a = keyboard.nextDouble();
		double b = keyboard.nextDouble();
		double c = keyboard.nextDouble();
		if (a==0) {
			throw new ArithmeticException("I need a!=0; please try again.");
		} else if (b*b-4*a*c < 0) {
			throw new ArithmeticException("I need b*b>=4*a*c; please try again.");
		} 
		double x1 = (-b+sqrt(b*b-4.0*a*c))/(2.0*a);
		double x2 = (-b-sqrt(b*b-4.0*a*c))/(2.0*a);
		System.out.println("Roots are x1="+x1+" and x2="+x2);
	}	
}