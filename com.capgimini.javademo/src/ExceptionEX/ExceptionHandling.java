package ExceptionEX;

public class ExceptionHandling{
	void validate(int age) {
		try {
			if(age>16) {
				System.out.println("Student is Eligible");
			}
			else {
				
				throw new ArithmeticException("Student is not eligibile");
				}
		} catch (ArithmeticException e) {
			
			e.printStackTrace();
		}
	}

public static void main(String[]args) {
	ExceptionHandling obj=new ExceptionHandling();
	obj.validate(10);
	System.out.println("Hello");
	}
}


