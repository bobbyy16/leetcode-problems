class Solution
{
    public int[] getConcatenation(int[] nums){
    int ans[] = new int[2*nums.length];
        int p = 0;
        for(int i = 0; i < nums.length; i++){
            ans[p] = nums[i];
            p++;
        }
                for(int i = 0; i < nums.length; i++){
            ans[p] = nums[i];
            p++;
        }
        return ans;
    }
}