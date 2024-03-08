package array;

public class MaxContainerVolume {
	
	
	public static int maxVolume(int[] arr) {
		
		int volume = 0;
		
		if(arr.length<=0) {
			return volume; 
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				int block = j-i;
				int max= 0;
				if(arr[i] <= arr[j]) {
					max = block * arr[i];
				}else {
					max = block * arr[j];
				}
				
				volume = Math.max(max, volume);
			}
			
		}
		
		
		return volume;
	}
	
	public static void main(String[] args) {
		int[] arr = {3, 1, 2, 4, 5};
		
		System.out.println(maxVolume(arr));
	}

}
