package multithreading;

public class TestJoin extends Thread{
	public void run() {
		for(int i=1; i<=5;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) {
		TestJoin a1 = new TestJoin();
		TestJoin a2 = new TestJoin();
		TestJoin a3 = new TestJoin();
		
		a1.setName("First");
		a2.setName("Second");
		a3.setName("Third");
		
		try {
			a1.join(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		a1.start();
		a2.start();
		a3.start();
	}
}
