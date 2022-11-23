package Multithreading;

	class Eclipse extends Thread{
		public void run() {
			System.out.println("Eclipse thread name is"+ Thread.currentThread().getName());
			System.out.println("Eclipse thread id is"+ Thread.currentThread().getId());
		}
	}
	class Calculator extends Thread{
		public void run() {
			System.out.println("Calculator thread name is"+ Thread.currentThread().getName());
			System.out.println("Calculator thread id is"+ Thread.currentThread().getId());
		}
	}
	class Chrome extends Thread{
		public void run() {
			System.out.println("Chrome thread name is"+ Thread.currentThread().getName());
			System.out.println("Chrome thread id is"+ Thread.currentThread().getId());
		}
	}
	class OneNote extends Thread{
		public void run() {
			System.out.println("OneNote thread name is"+ Thread.currentThread().getName());
			System.out.println("OneNote thread id is"+ Thread.currentThread().getId());
		}
	} 

 class Thread1 {
		public static void main(String[] args) {
			Eclipse e = new Eclipse();
			e.start();
			Calculator c = new Calculator();
			c.start();
			Chrome ch = new Chrome();
			ch.start();
			OneNote o = new OneNote();
			o.start();
			
			System.out.println("Main thread name is "+ Thread.currentThread().getName());
			System.out.println("Main thread id is "+ Thread.currentThread().getId());
		}

	}

 }
