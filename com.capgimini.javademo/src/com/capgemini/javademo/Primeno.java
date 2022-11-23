package com.capgemini.javademo;

public class Primeno {

	public static void main(String[] args) {
		//main method is declered
		
			int number = 7;
			//number is declared
			boolean isPrime = true;
			//for loop initializes
			for(int i = 2; i < number/2; i++)
			{
				if(number % i == 0)
				{
					isPrime = false;
				}
			}
			//if statement executing
			if(isPrime == true)
			{
	System.out.println("The number is a prime number");
			}
			//if "if" statement is false then else part will execute
			else
				
			{
	System.out.println("The number is not a prime number");
			}


		}

	}
		