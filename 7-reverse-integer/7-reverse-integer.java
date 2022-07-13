class Solution {
    public int reverse(int x) {
        boolean negative = false;
        if(x<0){
           negative=true;
            x=x*-1;
        } 
        int sum =0;
        int i = String.valueOf(x).length()-1;
        while(x>0){
            if (sum <= -2147483647 || sum >= 2147483647)  return 0;
            int rem = x%10;
            x = (int) x/10;
            sum+= rem*(Math.pow(10,i));
            i--;
        }
        if(negative){
            sum*=-1;
        }
        return sum;
        }
}