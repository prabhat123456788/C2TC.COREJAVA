package ExceptionEX;


	 class Test {

		public static void main(String[] args) {
			int arr[]=new int[7];
			try {
				arr[10]=9/0;
			}catch (ArithmeticException e) {
				e.printStackTrace();
			}
			catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
			System.out.println("Print Me");
			}

		}

