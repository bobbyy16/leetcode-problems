import java.util.Arrays;
class Solution {
   int largest(int[] nums)
   {
            if(nums.length==0)
                  return -1;
            int max=nums[0];
            for(int i=1;i<nums.length;i++)
            {
              if(max<nums[i])
                max=nums[i];
            }
    return max;
  }
    public List<Boolean> kidsWithCandies(int[] nums, int extraCandies) {
            int max=largest(nums);
            Boolean[] list=new Boolean[nums.length];
            for(int i=0;i<nums.length;i++){
              if((nums[i]+extraCandies >= max))
                  list[i]=true;
              else
                  list[i]=false;
            }
            return Arrays.asList(list);
    }
}