package com;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ajs = new Scanner(System.in);
		System.out.print("Start from");
		int a = ajs.nextInt();
		System.out.print("End from");
		int b = ajs.nextInt();

		ArrayList<Integer> mainlist = new ArrayList<Integer>();
		for (int i = a; i <= b; i++) {
			mainlist.add(i);
		}
		System.out.println("Main LIst:" + mainlist);
		
		int sum = 0;
		for (int Sum : mainlist) {
			sum += Sum;
		}
		System.out.println("Sum of all numbers:" + sum);

		int multiple = 1;
		for (int Sum : mainlist) {
			multiple *= Sum;
		}
		System.out.println("Multiples of all numbers:" + multiple);

		ArrayList<Integer> even = new ArrayList<Integer>();
		for (int j = a; j <= b; j++) {
			if (j % 2 == 0) {
				even.add(j);
			}
		}

		System.out.println("Even number:" + even);

		ArrayList<Integer> odd = new ArrayList<Integer>();
		for (int k = a; k <= b; k++) {
			if (k % 2 != 0) {
				odd.add(k);
			}
		}
		System.out.println("Odd number:" + odd);

		int evensum = 0;
		for (int j : even) {
			evensum += j;
		}
		System.out.println("Sum of all evennumbers:" + evensum);

		int oddsum = 0;
		for (int k : odd) {
			oddsum += k;
		}
		System.out.println("Sum of all oddnumbers:" + oddsum);

		int oddsum1 = 0;
		int oddmultiple =1;
		for (int k : odd) {
			oddsum1 += k;
			oddmultiple *= k;
		}
		System.out.println("Sum & Multiple of all odd numbers:" + oddsum1+" & "+oddmultiple);
		
		int evensum1 = 0;
		int evenmultiple = 1;
		for (int j : even) {
			evensum1 += j;
			evenmultiple *= j;
		}
		System.out.println("Sum & Multiple of all even numbers:" + evensum1+" & "+evenmultiple);
		
	}

}
