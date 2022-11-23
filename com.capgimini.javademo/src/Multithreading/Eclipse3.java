package Multithreading;

	class Eclipse3 extends Thread{
		public void run() {
			for (int i = 0; i < 3; i++) {
				System.out.println("Eclipse Thread name is " + Thread.currentThread().getName());
				System.out.println("Eclipse Thread Id is " + Thread.currentThread().getId());
				try {
					//used for blocked state
					sleep(6000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	 class MultiThreading2 {

		public static void main(String[] args) {
			Eclipse3 e = new Eclipse3();
			e.start();
			
			Eclipse3 e1 = new Eclipse3();
			e1.start();
		}

	}


