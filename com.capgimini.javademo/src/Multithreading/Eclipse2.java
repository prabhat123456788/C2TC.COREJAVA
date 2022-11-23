package Multithreading;

	class Eclipse2 implements Runnable{
		public void run() {
			for (int i = 0; i < 3; i++) {
				System.out.println("Eclipse Thread name is " + Thread.currentThread().getName());
				System.out.println("Eclipse Thread Id is " + Thread.currentThread().getId());
			}
		}

	}
	class Chrome2 implements Runnable{
		public void run() {
			for (int i = 0; i < 3; i++) {
				System.out.println("Chrome Thread name is " + Thread.currentThread().getName());
				System.out.println("Chrome Thread Id is " + Thread.currentThread().getId());
			}
		}

	}

	 class MultiThreading1 {

		public static void main(String[] args) {
			Eclipse2 e = new Eclipse2();
			Thread t=new Thread(e);//to access start method 
			t.start();
			t.setPriority(Thread.MIN_PRIORITY);//set priority to thread
			
			Chrome2 c = new Chrome2();
			Thread t1=new Thread(c);
			t1.start();
			t1.setPriority(Thread.MAX_PRIORITY);
			
			for (int i = 0; i < 3; i++) {
				System.out.println("Main thread name is " + Thread.currentThread().getName());
				System.out.println("Main Thread id is " + Thread.currentThread().getId());
			}
		}
	 }
	 
		