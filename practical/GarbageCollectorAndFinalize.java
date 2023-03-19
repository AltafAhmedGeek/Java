
public class GarbageCollectorAndFinalize {

	
	public void finilize() {
		System.out.println("finaize method called before gc()");
	}
	
	public static void main(String[] args) {
		int a=89;
		Integer f=null;
		char c='f';
		GarbageCollectorAndFinalize gcf=new GarbageCollectorAndFinalize();
		
		
		System.gc();
		System.out.println("main method ended...");
	}

}
