package java_20190610;

public class ThreadDemo extends Thread {
	public ThreadDemo(String msg) {
		super(msg);

	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " : " + i);
			;
		}
	}

	public static void main(String[] args) {
		System.out.println("***************************start***************************");
		ThreadDemo t1 = new ThreadDemo("첫번째 스레드");
		t1.start();
		ThreadDemo t2 = new ThreadDemo("두번째 스레드");
		t2.start();
		System.out.println("****************************end****************************");

	}

}
