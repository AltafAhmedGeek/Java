package Lab9;


class Average extends Thread{

	@Override
	public void run() {
		int sum=0;
		for (int i = 1; i < 11; i++) {
			sum+=i;
		}
//		printing average of first 10 numbers
		System.out.println("Average of first 10 numbers : "+sum);
	}
	
}
class Square extends Thread{
	@Override
	public void run() {
		int arr[]= {1,20,50,15,30};
//		declaring integer type sqr[] of size 10
		int sqr[]= new int[5];
//		storing square of each element of array arr[] in sqr[]
		for (int i = 0; i < arr.length; i++) {
			sqr[i]=arr[i]*arr[i];
		}
//		printing elements of sqr[]

		System.out.print("Square of arrray elements: ");
		for (int i = 0; i < sqr.length; i++) {
			System.out.print(sqr[i]+",");
		}
	}
}
public class Statement1 {

	public static void main(String[] args) {
//		creating instance of Average as avg

		Average avg= new Average();
//		starting avg Thread
		avg.start();
		try {
//			using join() with avg  to make it wait for completion
			avg.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		creating instance of Square as sq
		Square sq= new Square();
//		starting sq Thread
		sq.start();
	}

}
