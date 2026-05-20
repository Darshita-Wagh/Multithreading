package multithreading;

public class Movie extends Thread{
	public void run() {
		System.out.println("Running Thread");
		for(int i=1; i<5; i++){
			System.out.println(Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) {
		Movie m1 = new Movie();
		Movie m2 = new Movie();
		Movie m3 = new Movie();
		m1.setName("1.YJHD");
		m1.start();
		m2.start();
		m3.start();
	}
}
