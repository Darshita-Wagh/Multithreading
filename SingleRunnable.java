package multithreading;

public class SingleRunnable implements Runnable{
	public void run() {
		System.out.println("Using  Runnable interface");
		for(int i=1; i<=10; i++) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		SingleRunnable s2 = new SingleRunnable();
		Thread t = new Thread(s2);
		t.start();
	}
}
