package Lab9;
class Odd extends Thread{
	@Override
	public void run() {
		for (int i = 1; i <=100; i++) {
			if(i%2!=0) {
//				printing odd numbers
				System.out.print(i+",");
			}
		}
//		line break after printing odd numbers
		System.out.println();

	}
}
class Even extends Thread{
	@Override
	public void run() {
		for (int i = 1; i <=100; i++) {
			if(i%2==0) {
//				printing odd numbers

				System.out.print(i+",");
			}
		}
	}
}

public class Statement2 {

	public static void main(String[] args) {
//		creating instance of Odd
		Odd odd= new Odd();
//		starting odd thread
		odd.start();
		try {
//			using join() with odd  to make it wait for completion
			odd.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		creating instance of Odd

		Even even= new Even();
//		starting even thread
		even.start();
	}

}
