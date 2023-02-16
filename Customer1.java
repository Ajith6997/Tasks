package com;

import java.util.Scanner;

public class Customer1 {
	private static Customer1 single_instance = null;
	public String name;
	public int id;

	private Customer1(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public static Customer1 getinstance(String name, int id) {

		if (single_instance == null)
			single_instance = new Customer1(name, id);
		return single_instance;
	}

	static class SIngleton {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Customer Name");
			String name1 = sc.nextLine();
			System.out.println("Enter the Customer Id");
			int id1 = sc.nextInt();
			Customer1 x = Customer1.getinstance(name1, id1);
			System.out.println(x.name + "," + x.id);
			sc.close();
		}
	}
}