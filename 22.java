An array is considered special if every pair of its adjacent elements contains two numbers with different parity.
You are given an array of integers nums. Return true if nums is a special array, otherwise, return false.
class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length == 1) return true;
        for(int i=0;i<nums.length;i++){
            if(isEven(nums[i])&& i<nums.length-1){
                if(isOdd(nums[i+1])) continue;
                else return false;
            }
            if(isOdd(nums[i])&& i<nums.length-1){
                if(isEven(nums[i+1])) continue;
                else return false;
            }
        }
        return true;
    }
    static boolean isEven(int n){
        if(n%2==0) return true;
        else return false;
    }
    static boolean isOdd(int n){
        if(n%2!=0) return true;
        else return false;
    }
}
