class Solution {
public int majorityElement(int[] nums) {
int c = 1, m = nums[0];
for (int i = 1; i < nums.length; i++) {
if (m == nums[i]) c++; else c--;
if (c < 0) {
m = nums[i];
c = 0; }
}
return m;
}
}