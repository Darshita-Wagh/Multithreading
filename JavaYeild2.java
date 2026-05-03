package multithreading;

public class JavaYeild2 extends Thread{
	public void run() {
        for (int i = 1; i <= 5; i++) {
        	System.out.println(Thread.currentThread().getName()+" "+i);
            Thread.yield();
        }
    }

    public static void main(String[] args) {

        JavaYeild2 t1 = new JavaYeild2();
        JavaYeild2 t2 = new JavaYeild2();


        t1.setName("First");
        t2.setName("Second");
        
        t1.start();
        t2.start();
        
        //t1.interrupt();
    }
}
