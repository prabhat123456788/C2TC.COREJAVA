package com.capgemini.genericsdemo;


 class Test<T>
 {
	  
	 private T obj;

	public Test(T obj) {
				this.obj = obj;
	}

	public T getObj() {
		return obj;
	}

	@Override
	public String toString() {
		return "Test [obj=" + obj + "]";
	}
	 
 } 
	 
public class GenericClassDemo {

	public static void main(String[] args) {

	
		 Test<String> t=new Test<String>("sam");
		 String out= t.getObj();
		System.out.println(out);

	}
}
