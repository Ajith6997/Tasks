package com;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer = Customer.getInstance();
		System.out.println("Customer Id: "+ customer.getId());
		System.out.println("Customer Name: "+ customer.getName());
		System.out.println("Customer Email: "+ customer.getEmail());
		System.out.println("Customer Dob: "+ customer.getDob());
		System.out.println("Customer Status: "+ customer.getStatus());
		System.out.println("Customer Phoneno: "+ customer.getPhoneno());
		
		Customer customer1 = Customer.getInstance();
		System.out.println(customer1.getInstance() );
		
		
		
		 

	}

}
