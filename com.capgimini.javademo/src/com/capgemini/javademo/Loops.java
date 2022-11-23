package com.capgemini.javademo;

public class Loops {

	public static void main(String[] args) {
		// for loop
		  for(int i=1,j=1; i<10||j<10;i++,j++)
		  { 
			  j++;
			  System.out.println("i="+i+" and j="+j); 
		  }


		  // while loop 
			  int i=1,j=1;
			  while(i<10 || j<10)
			  { 
				  i++; j++;
			      System.out.println("i="+i+" and j="+j); 
			  }	
			
		// Do while loop
			int o= 1,p = 1;
			do {
				o++;
				p++;
				System.out.println("i=" + o + " and j=" + p);
			    } while (o < 10 || p < 10);
		}


	}
		