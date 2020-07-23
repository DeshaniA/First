
public class ThreadTwo extends Thread {
	
	public static Object lock1 = new Object();
	
	public static Object lock2 = new Object();
	
	public void run() {
		
		System.out.println("Started Executing Thread 2");
		
		synchronized(lock2) {
			
			System.out.println("Thread 2 holding lock 2.....");
			
			try {
				Thread.sleep(10);
				
				
			}catch(InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("Thread 2 is awiting for lock 1");
			
			synchronized(lock1) {
				System.out.println("Thread 2 is holding lock 1 & lock 2");
			}
		}
		
	}
	
}
