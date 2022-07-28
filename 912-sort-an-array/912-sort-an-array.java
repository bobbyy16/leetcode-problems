class Solution {
    public int[] sortArray(int[] arr) {
        divide(arr, 0, arr.length-1); 
        return arr; 
    }
    
	private void divide(int[] arr, int start, int end) {		
		if (start==end) return;
		
		int mid = (end-start)/2 + start; 
		
		divide(arr, start, mid);
		divide(arr, mid+1, end);
		
		conqure(arr, start, mid, end); 
	}
	
	private void conqure(int[] arr, int start, int mid, int end) {
		int i = start; 
		int j = mid+1; 
		int k = 0; 
		
		int[] aux = new int[end-start+1]; 
		
		while (i<=mid && j<=end) {
			if (arr[i] > arr[j]) { 
				aux[k++] = arr[j++];
			}
			else {
				aux[k++] = arr[i++];
			}
		}
		
		while(i<=mid) aux[k++] = arr[i++]; 
		while(j<=end) aux[k++] = arr[j++];
		
		for (i=start; i<=end; i++) { 
			arr[i] = aux[i-start]; 
		}
	}
}