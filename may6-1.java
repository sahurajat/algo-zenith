//Given an array nums of size n, return the majority element.
//brute force approach
//tc->O(n^2)  sc->O(1)
class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        if(n==1)
        {
            return nums[0];
        }
        else
        {
           for(int i=0;i<n;i++)
        {
            int target=nums[i];
            int count=0;
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]==nums[j])
                {
                    count++;
                    if(count >=n/2)
                    {
                        return target;
                    }
                }
            }
        }
        return -1;
        }

    }
}

//optimal approach   tc->O(N) sc->O(1)
class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
       int cnt = 0; // count
        int el = 0; // Element

        //applying the algorithm:
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = nums[i];
            } else if (el == nums[i]) cnt++;
            else cnt--;
        }
          //checking if the stored element
        // is the majority element:
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == el) cnt1++;
        }

        if (cnt1 > (n / 2)) return el;
        return -1;

    }
}
