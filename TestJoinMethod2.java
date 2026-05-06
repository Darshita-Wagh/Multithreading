package multithreading;

public class TestJoinMethod2 extends Thread {
	public void run() {
		for(int i=1; i<5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
			
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	public static void main(String[] args) {
		TestJoinMethod2 j1 = new TestJoinMethod2();
		TestJoinMethod2 j2 = new TestJoinMethod2();
		TestJoinMethod2 j3 = new TestJoinMethod2();
		TestJoinMethod2 j4 = new TestJoinMethod2();
		
		j1.start();
		try {
			j1.join();
		} catch (Exception e) {}
		j2.start();
		try {
			j2.join();
		} catch (Exception e) {}
		j3.start();
		j4.start();
		
		System.out.println("Name of t1:"+j1.getName());
		System.out.println("Name of t2:"+j2.getName());
		System.out.println("id of t1:"+j1.getId());
		System.out.println("id of t1:"+j2.getId());
	}
}
