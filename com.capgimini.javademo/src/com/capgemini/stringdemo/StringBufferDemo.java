	package com.capgemini.stringdemo;

	public class StringBufferDemo {

			public static void main(String[] args) {

				StringBuffer sb=new StringBuffer("Hello World");
				
				System.out.println("Before Manipulation "+sb);
				
				System.out.println("After Manipulation "+sb.reverse());
				
				System.out.println("After Manipulation "+sb.append(2334));
				System.out.println("After Manipulation "+sb.append('s'));


			}

		}


