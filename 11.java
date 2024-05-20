// Reverse an Integer LeetCode Problem
class Solution {
    public int reverse(int x) {
        long sum=0;
        int temp = Math.abs(x);
        while(temp!=0){
            sum=sum*10+temp%10;
            temp=temp/10;
        }
        if(sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE){
            return 0;
        }

        if(x < 0){
            sum = sum * (-1);
        }
        return (int)sum;
    }
}
