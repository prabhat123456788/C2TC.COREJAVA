package Multithreading;

 class Eclipse1 extends Thread {
	public void run() {
		for (int i = 0; i < 4; i++) {
			System.out.println("Eclipse thread name is " + Thread.currentThread().getName());
			System.out.println("Eclipse thread id is " + Thread.currentThread().getId());
		}
	}
}

  class MultiThreading {

	public static void main(String[] args) {
		Eclipse1 e = new Eclipse1();
		e.start();
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Main thread name is " + Thread.currentThread().getName());
			System.out.println("Main thread id is " + Thread.currentThread().getId());
		}
	}

}