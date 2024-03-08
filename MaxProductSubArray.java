package array;

public class MaxProductSubArray {
	
	public static int maxProduct(int[] arr) {
		
		int product = 0;

		for (int i = 0; i < arr.length; i++) {
			int mul = arr[i];
			for (int j = i+1; j < arr.length; j++) {
				mul *= arr[j];
			}
			
			product = Math.max(product, mul);
		}
		
		return product;
	}
	public static void main(String[] args) {
		int[] arr = {1, -2, -3, 0, 7, -8, -2};
		
		System.out.println(maxProduct(arr));
	}

}
