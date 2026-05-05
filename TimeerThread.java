package multithreading;

public class TimeerThread extends Thread{
	public void run() {
		System.out.println("Thread is running....");
	
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) {
		TimeerThread a1 = new TimeerThread();
		TimeerThread a2 = new TimeerThread();
		TimeerThread a3 = new TimeerThread();
		
		a1.setName("First");
		a2.setName("Second");
		//a3.setName("Third");
		
		try {
			a1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		a1.start();
		a2.start();
		//a3.start();
	}
}
