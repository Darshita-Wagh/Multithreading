package multithreading;

public class TestMultiPriority extends Thread {
	public void run() {
		System.out.println("Running thread name is:"+Thread.currentThread().getName());
		System.out.println("Running thread priority is:"+Thread.currentThread().getPriority());
	}
	
	public static void main(String[] args) {
		TestMultiPriority m1 = new TestMultiPriority();
		TestMultiPriority m2 = new TestMultiPriority();
		
		m1.setName("Division A");
		m2.setName("Division B");
		m1.setPriority(Thread.MIN_PRIORITY);
		m2.setPriority(Thread.NORM_PRIORITY);
		m1.start();
		m2.start();
		
	}

}
