package threadDemo;

public class ThreadDemo3  {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getClass());
		System.out.println(Thread.currentThread().isAlive());
		System.out.println(Thread.currentThread().isDaemon());
		System.out.println(Thread.currentThread().isInterrupted());
		System.out.println(Thread.currentThread().getState());
		Thread.currentThread().setPriority(10);
		Thread.currentThread().setName("myThread");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		
	}

}
