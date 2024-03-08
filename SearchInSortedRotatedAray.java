package array;

public class SearchInSortedRotatedAray {

	private static int findPivot(int[] arr) {
		
		int pivot = -1;
		int j=arr.length-1;
		int i = j-1;
		
		while(i>-1 && j>-1) {
			
			if(arr[i]>arr[j]) {
				return i;
			}
			i--;
			j--;
		}
		return pivot;
	}
	
	public static int search(int[] arr,int startindex, int endIndex,  int key) {
		//any search 
			// linear or binary
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
		int key =3;
		int result = -1;
		
		int p = findPivot(arr);
		
		if (p == -1) {
			result = search(arr,0, arr.length-1, key);
		}
		
		if(arr[p] == key) {
			result = p;
		}else {
			if(key <= arr[0]) {
				result = search(arr,0, p, key);
			}
				result = search(arr,p+1, arr.length-1, key);
		}
	}
}
