package com.java2;

public  class Employee {
	public void empname() {
		// TODO Auto-generated method stub
System.out.println("enter the name");
	}
	
	public static void main(String[] args) {
		Employee a = new Employee() {
		};
		Company b = new Company();
		Client c = new Client();
		Project d = new Project();
		
		a.empname();
		b.companyname();
		c.clientnam();
		d.projectname();
		
	}

}
