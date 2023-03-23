package threadDemo;



class Thread1 extends Thread{
	
	public void run()
	{
		System.out.println("thread 1");
		for (int i = 0; i <=10; i++) {
			System.out.print(i+" ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}
class Thread2 extends Thread{
	public void run(){
		System.out.println("thread 2");
	for (int i = 0; i <=10; i++) {
		System.out.print(i+" ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	System.out.println();
}
}
public class JoinThreadDemo {

	public static void main(String[] args) {
		
		Thread1 t1= new Thread1();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread2 t2= new Thread2();
		t2.start();
		try {
			t2.join(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("This is main thread");
	}

}
