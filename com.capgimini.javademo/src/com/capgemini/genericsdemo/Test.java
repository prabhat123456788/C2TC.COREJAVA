package com.capgemini.genericsdemo;


 public class Test<T>
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
 class GenericClassDemo {

public static void main(String[] args) {


	 Test<String> t=new Test<String>("sam");
	 String out= t.getObj();
	System.out.println(out);
}
}
