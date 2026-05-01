package multithreading;

public class SingleThread1 extends Thread{
	public void run() {
		System.out.println("Thread executed");
		for(int i=1; i<=10; i++) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		SingleThread1 s1 = new SingleThread1();
		s1.start();
	}
}
