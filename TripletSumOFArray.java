package array;

public class TripletSumOFArray {
	public static void sum(int[] arr) {
		
		
		int  sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				for (int k = j+1; k < arr.length; k++) {
					if(arr[i] + arr[j] + arr[k] == sum) {
						System.out.println( arr[i] + " , " + arr[j]+ " , " + arr[k]);
					}
				}
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		int[] arr = {0, -1, 2, -3, 1 };
		
		sum(arr);
	}
}
