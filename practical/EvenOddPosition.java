package arrayExercise;

public class EvenOddPosition {

	public static void SortByposition(int arr[])
	{
		System.out.println("At even posiotion: ");
		for (int i = 0; i < arr.length; i++) {
			if (i%2==0) {
				System.out.println(arr[i]);
			}
		}
		System.out.println("At odd posiotion: ");
		for (int i = 0; i < arr.length; i++) {
			if (i%2!=0) {
				System.out.println(arr[i]);
			}
		}

	}
	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 3, 1 };
		SortByposition(arr);
		
	}

}
