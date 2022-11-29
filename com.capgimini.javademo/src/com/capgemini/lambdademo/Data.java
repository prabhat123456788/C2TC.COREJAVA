package com.capgemini.lambdademo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


	class Data
	{
		private String name;

		public Data(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		@Override
		public String toString() {
			return "Data [name=" + name + "]";
		}
		
		}

	  class App {

		public static void main(String[] args) {
			List<Data> list=new ArrayList<>();
			list.add(new Data("Nayna"));
			list.add(new Data("Sanavi"));
			list.add(new Data("Aardhya"));
			list.add(new Data("Arun"));
			list.add(new Data("Sarvashri"));
			list.add(new Data("Shreya"));

					
			
			Collections.sort(list,(Data o1,Data o2)->{return o1.getName().compareTo(o2.getName());});
			
						
			
			list.forEach(temp->{System.out.println(temp.getName());});
		}
	}