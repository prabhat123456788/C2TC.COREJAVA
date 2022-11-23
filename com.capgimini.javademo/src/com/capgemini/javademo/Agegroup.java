package com.capgemini.javademo;

public class Agegroup {

	public static void main(String[] args) {
		//we compare 2 variables
		 int x = 10, y = 11;
		  
		  if(!(x < y) || (x == y))//USE COMPARISION OPERATORS and OR OPERATOR and check the condition
		  { 
			  System.out.println("Condition is TRUE");
		  }
		  else
		  { 
			  System.out.println("Condition is FALSE"); 
		  }
		 

		//we compare age of girl and boy
		int ageOfBoy = 36;
		int ageOfGirl = 25;

		if ((ageOfBoy >= 21) && (ageOfGirl >=18)) //USE COMPARISION OPERATORS and AND OPERATOR and check the condition
		{
			System.out.println("ready to get married!");
		} 
		else 
		{
			System.out.println("Wait for it kiddo!");
		} 

	}

}
		