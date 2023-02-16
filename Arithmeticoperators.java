package com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Arithmeticoperators {
	
	public static int SUM(int a, int b)  {
		return a + b;
	}
	public static int SUBTRACTION(int a, int b) {
		return a - b;
	}
	public static int MULTIPLICATION(int a, int b) {
		return a * b;
	}
	public static int MODULES(int a, int b) {
		return a % b;
	}
	public static int DIVISI0N(int a, int b) {
		return a / b;
	}
	
public static class Testing {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		 int a = 0, b = 0;
		 boolean validInput = false;
		 
		 while(!validInput) {
	     try {
	    	 System.out.print("Enter the first number: ");
	    	 a = obj.nextInt();
	    	 
	    	 System.out.print("Enter the last number: ");
	    	 b = obj.nextInt();
	    	 validInput = true;
	     } catch (InputMismatchException e) {
	    	 System.out.println("Invalidinput,please enter the integers");
	    	 obj.nextLine();
	     }
	    	 
	     }
		int Addition =Arithmeticoperators.SUM(a,b);
		System.out.println("Sum: " + Addition);
		
		int Difference = Arithmeticoperators.SUBTRACTION(a,b);
		System.out.println("Subtract: " + Difference);
		
		int Product =Arithmeticoperators.MULTIPLICATION(a,b);
		System.out.println("Multiply: " + Product);
		
		int  Mod =Arithmeticoperators.MODULES(a,b);
		System.out.println("Modules: " + Mod);
		
		double Divide =Arithmeticoperators.DIVISI0N(a,b);
		System.out.println("Divide: " + Divide );
		
		
	}

	}

}
 