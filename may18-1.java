//1. Two Sum
//target.You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.

//better apprach  //tc->O(nlog n)  sc->O(n)
import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int no=nums[i];
            int moreNeeded = target - no;
            if(mpp.containsKey(moreNeeded)){
                ans[0] = mpp.get(moreNeeded);
                ans[1] = i;
                return ans;
            }
            mpp.put(nums[i], i);
        }
        return ans;
    }
}


//optimized approach
class Solution {
    public int[] twoSum(int[] nums, int target) {

        int n=nums.length;
        Arrays.sort(nums);
        int left=0;int right=n-1;
        while(left < right)
        {
            int sum=nums[left]+nums[right];
            if(sum  == target)
            {
                  return new int[] { left, right };

            }
            else if(sum < target) left++;
            else  right--;

        }
        return new int[] { -1, -1 };
        //return -1;
       // If no solution is found, return an empty array or throw
      // throw new IllegalArgumentException("No two sum solution");
    }
}