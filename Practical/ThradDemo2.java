package threadDemo;

public class ThradDemo2 extends Thread {

	 ThradDemo2(String name)
	{
		super(name);
	}
	
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print(i+" ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		Thread t1 = new ThradDemo2("first");
		System.out.println(t1.getName());
		t1.start();
		ThradDemo2 t2 = new ThradDemo2("second");
		System.out.println(t2.getName());
		t2.start();
	}

}
