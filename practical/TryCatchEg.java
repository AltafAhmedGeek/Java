
public class TryCatchEg {

	public static void main(String[] args) {
		try {
//			int num=23/0;
//			System.out.println(num);
//			String msg=null;
//			System.out.println(msg.length());
			String str="hello";
			int strNum=Integer.parseInt(str);
		} catch (Exception e) {
		System.out.println(e.getMessage());
		}

	}

}
