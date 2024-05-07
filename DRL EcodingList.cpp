// # PROBLEM NO 1313 
class Solution {
public:
    vector<int> decompressRLElist(vector<int>& nums) {
        // Brute Force Approach
        int n = nums.size();
        vector<int>dcmprsdlist(n);
        for(int i=0;i<=n/2;i+=2)
        {
            while(nums[2*i]!=0)
            {   
                dcmprsdlist.push_back(nums[2*i+1]);
                nums[2*i] -1;
            }
        }
        return dcmprsdlist;
    }
};
