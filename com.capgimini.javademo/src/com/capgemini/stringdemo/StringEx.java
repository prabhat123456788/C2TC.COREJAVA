 package com.capgemini.stringdemo;

public class StringEx {

		public static void main(String[] args) {

		//	String str="Java Program";
			
			String str=new String("Java Program");
			
			String str1=new String("java program");
			
			System.out.println(str);
			
			System.out.println(str.charAt(3));
			
			System.out.println(str.equalsIgnoreCase(str1));
			
			String str2=str.substring(5);
			System.out.println(str2);
			
		}

	}


