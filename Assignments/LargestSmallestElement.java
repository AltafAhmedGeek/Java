package arrayExercise;

public class LargestSmallestElement {
	public static void largest(int arr[]) {
		int largest = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		System.out.println("Largest element: " + largest);
	}

	public static void smallest(int arr[]) {
		int smallest = arr[0];

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		System.out.println("Smallest element: "+smallest);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, 6, 3, 1 };

		largest(arr);
		smallest(arr);
	}

}
