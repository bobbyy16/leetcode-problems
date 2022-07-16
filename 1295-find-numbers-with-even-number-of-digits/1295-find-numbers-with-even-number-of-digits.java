class Solution {
    public int findNumbers(int[] arr) {
          int count = 0;
        for(int num : arr){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    
    boolean even(int arr){
        int numDigits = digits(arr);
        return numDigits % 2 == 0;
    }
    
    int digits(int arr){

        if(arr < 0){
            arr = arr * -1;
        }

        if(arr == 0){
            return 1;
        }

        int count = 0;
        while(arr > 0){
            count++;
            arr = arr/10;
        }
        return count;
    }
}