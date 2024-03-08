package array;

public class KadanesAlgo {
	
//	Initialize:
//	    max_so_far = INT_MIN
//	    max_ending_here = 0
//
//	Loop for each element of the array
//
//	  (a) max_ending_here = max_ending_here + a[i]
//	  (b) if(max_so_far < max_ending_here)
//	            max_so_far = max_ending_here
//	  (c) if(max_ending_here < 0)
//	            max_ending_here = 0
//	return max_so_far
	public static int findMaxSumContigouousSubArray(int[] arr) {
		
		
		int max_so_far = Integer.MIN_VALUE;
		int curr_sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			curr_sum +=arr[i];
			
			if(max_so_far< curr_sum) {
				max_so_far = curr_sum;
			}
			if(curr_sum < 0) {
				curr_sum = 0;
			}
		}
		return max_so_far;
	}
	
	public static void main(String[] args) {
		int[] arr = {4,5,6,-1,-2,5,7,8,-2,3,-56};
		
		System.out.println(findMaxSumContigouousSubArray(arr));
	}

}
