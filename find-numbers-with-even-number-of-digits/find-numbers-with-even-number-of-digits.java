class Solution {
    public int findNumbers(int[] nums) {
        int sum = 0;
int type = 0;
for(int i=0;i<nums.length;i++){
int num = nums[i];
while(num>0){
num = num/10;
sum++;
}
if(sum%2==0){
type++;
}
sum=0;
}
return type;
}
    }
