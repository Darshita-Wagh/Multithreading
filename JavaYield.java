package multithreading;

public class JavaYield extends Thread{
	public void run() {
		for(int i=0; i<5; i++) {
			Thread.yield();
			System.out.println("Started:"+Thread.currentThread().getName());
		}
		System.out.println("Ended:"+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		JavaYield t1 = new JavaYield();
		JavaYield t2 = new JavaYield();
		JavaYield t3 = new JavaYield();
		
		t1.setName("Yash");
		t2.setName("Sahil");
		t3.setName("Disha");
		
		t1.setPriority(MAX_PRIORITY);//10
		t2.setPriority(MIN_PRIORITY);//1
		t3.setPriority(NORM_PRIORITY);//5
		
		t1.start();
		t2.start();
		t3.start();
		
//		for(int i=0; i<5; i++) {
//			System.out.println("Ended:"+Thread.currentThread().getName());
//		}
//		System.out.println("Ended:"+Thread.currentThread().getName());
	}
	
//	public void run() {
//        for (int i = 1; i <= 5; i++) {
//        	int x=1;
//        	System.out.println(x);
//            //System.out.println(Thread.currentThread().getName());
//            x++;
//            Thread.yield();
//        }
//    }
//
//    public static void main(String[] args) {
//
//        YieldExample t1 = new YieldExample();
//        YieldExample t2 = new YieldExample();
//
//        t1.start();
//        t2.start();
//        
//        //t1.interrupt();
//    }
}
