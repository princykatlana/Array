package array;

public class TrapRainWater {
	
	public static int trapRainWater(int[] arr) {
		
		int storage = 0;
		if(arr.length<=0) {
			return storage; 
		}
	
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[j] > arr[i]) {	
					for(int k=i+1; k<j; k++) {
					System.out.println("k: " + k);
					if(arr[i] == 0) {
						storage += 0;
					}else {
						storage += arr[i] - arr[k];
						System.out.println("storage: " + storage);
					}
				}
			}
			
		}
		
		}
		return storage;
	}
	
	


	public static void main(String[] args) {
		int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		
		System.out.println(trapRainWater(arr));
	}

}
