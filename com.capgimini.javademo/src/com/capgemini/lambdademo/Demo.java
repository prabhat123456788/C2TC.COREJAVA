package com.capgemini.lambdademo;

interface Lambda 
{
	public void demo();
	
}

public class Demo {

	public static void main(String[] args) {
		Lambda obj=()->
		{System.out.println("I am from Akola Batch");
		System.out.println("I am from Akola Batch");
		System.out.println("I am from Akola Batch");
		System.out.println("I am from Akola Batch");
		};
		obj.demo();
}
}
