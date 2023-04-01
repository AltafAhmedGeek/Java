package Lab9;

public class Statement3 extends Thread {
	//declaring instance variable 
	int number;

	//parameterized constructor which sets value of instance variable number
	Statement3(int number){
		this.number=number;
	}
	
	@Override
	public void run() {

		for (int i = 1; i <=10; i++) {
//			printing table of number
			System.out.println(number+"X"+i+"="+number*i);
			
			try {
//				sleeping the thread for 1 second
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
//		creating instance 2 passed as argument
		Statement3 table= new Statement3(2);
//		starting the table thread
		table.start();
	}

}
