class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 || (x%10 == 0 && x != 0))
            return false;
        
        int revNo = 0;
        
        while(x > revNo){
            int pop = x%10;
            revNo = revNo*10 + pop;
            x /= 10;
        }
        return (x == revNo || x == revNo/10);
    }
}