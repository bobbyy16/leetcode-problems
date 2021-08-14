class Solution {
      
    public int maximumWealth(int[][] nums) {
          int max=0;
    for(int row=0;row<nums.length;row++){
        int add=0;
        for(int col=0;col<nums[row].length;col++){
          add+=nums[row][col];
        }
      if(max<add){
        max=add;
      }
    }
    return max;  
    }
}