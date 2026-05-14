package multithreading;

public class Daemon extends Thread{  
	 public void run(){  
			if(Thread.currentThread().isDaemon()){//checking for daemon thread  
			System.out.println("daemon thread work "+Thread.currentThread().getName());  
			}  
			else{  
			System.out.println("user thread work "+Thread.currentThread().getName());  
			}  
	 }  
	 public static void main(String[] args){  
	  Daemon t1=new Daemon();//creating thread  
	  Daemon t2=new Daemon();  
	  Daemon t3=new Daemon();  
	  
	  t1.setDaemon(true);//now t1 is daemon thread  
	    
	  t1.start();//starting threads  
	  t2.start();  
	  t3.start();  
	 }  
	}  

