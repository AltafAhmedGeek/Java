package threadDemo;

public class MyThread implements Runnable {

	@Override
	public void run() {
		
System.out.println("this is thread");
	}

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread  t= new Thread(mt);
		t.start();

		System.out.println(t.currentThread());
		System.out.println(t.currentThread().getId());
		System.out.println(t.currentThread().getName());
	}

}
