class Solution {
public:
    vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
        //Brute-Force Method
        int n = candies.size();
        vector<bool> result(n);
       
        for(int i=0;i<n;i++) {
            result[i] = candies[i] + extraCandies >= *max_element(candies.begin(), candies.end());
        }
        return result;
    
    }
};
