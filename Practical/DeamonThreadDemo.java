package threadDemo;

public class DeamonThreadDemo implements Runnable{

	public static void main(String[] args) {
		Thread t=new Thread(new DeamonThreadDemo());
		t.setDaemon(false);
		t.start();
		boolean check_deamon= t.isDaemon();
		System.out.println(check_deamon);
	}

	@Override
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			
			System.out.println("this is deamon thread");
		}
		else {
			
			System.out.println("this is not deamon thread");
		}
		
	}

}
