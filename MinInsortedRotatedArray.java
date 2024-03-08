package array;

public class MinInsortedRotatedArray {
	
	public static int min(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		return min;
	}
	public static void main(String[] args) {
		int[] arr = {5, 6, 1, 2, 3, 4 };
		
		System.out.println(min(arr));
	}

}
