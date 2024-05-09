//Reverse Pairs
//Given an integer array nums, return the number of reverse pairs in the array.
//A reverse pair is a pair (i, j) where:
//0 <= i < j < nums.length and
//nums[i] > 2 * nums[j].
class Solution {
    public int reversePairs(int[] nums) {
        int cnt=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i] > (2*nums[j]))
                {
                    cnt++;

                }
            }
        }
        return cnt;
    }
}