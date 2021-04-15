//package day11;
//
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
//public class ThreadDemo {
//
//	public ThreadDemo() {
////		Thread t = new Thread();
////		t.start();
//		ExecutorService es = Executors.newFixedThreadPool(1);
//		es.execute(new MyThreadWork());
//		es.shutdown();
//	}
//	public static void main(String[] args) {
//		new ThreadDemo();
//		Thread t = Thread.currentThread();
//		for(int i=0;i<56;i++) {
//			System.out.println(i);
//		}
//	}
//}
//
//public class MyThreadWork implements Runnable {
//	
//	@Override
//	public void run() {
//		System.out.println("child called");
//		
//	}
//}