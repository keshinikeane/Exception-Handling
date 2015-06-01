package lab9;

import java.util.Random;
import java.util.Scanner;

public class BigArray {
	public static double[] makeRandom(int n) {
		Random r = new Random();
		double[] a = new double[n];
		for (int i=0; i<n; ++i) {
			a[i] = r.nextDouble();
		}
		return a;
	}
	
	public static double sum(double[] a) {
		double sum = 0.0;
		int n = a.length;
		for (int i=0; i<n; ++i) {
			sum+=a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the array length: ");
		int n = keyboard.nextInt();
		double[] a = makeRandom(n);
		double sum = sum(a);
		System.out.println("sum = "+sum);
		keyboard.close();
	}
}
/**
 * Questions: 
 * 
 * Using this class, what is the largest number n that you can 
 * specify without throwing an OutOfMemoryError?
 * 
 * 87556094
 * 
 * 
 * 
 * Given n, if you had to guess the value of the sum, what value would
 * you guess? Why?
 * 
 * The method nextDouble() in the class Random creates a random double
 * between 0.0 and 1.0. The average of these numbers should be close to 0.5 
 * so the sum of the values should be close to 0.5*n.
 */

