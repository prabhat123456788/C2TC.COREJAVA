package Superdemo;

    class Animal { 
		String color="white";
	}
	class Dog extends Animal{
		String Color="black";
	
	void printcolor() {
		System.out.println(color); //Print clour of Dog
		System.out.println(super.color); //prints color of animal class
	}
	}
		
	class TestSuper1{
	public static void main(String args[]) {
			Dog d=new Dog();
			d.printcolor();
			
		}}
