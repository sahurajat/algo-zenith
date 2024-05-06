class Solution {
public:
    int numberOfEmployeesWhoMetTarget(vector<int>& hours, int target) {
        // Optimised Approach using two pointer
        int s=0 ;
        int n = hours.size(); 
        int end = n-1;
        int c=0; int i=0;
        sort(hours.begin(),hours.end());
        while(end>=s)
        {
            if(hours[i] < target)
            {
                s++; i++;
            }
            else 
            {
            c++; i++ ;end--;
            }
        }
        return c;
       
    }
};
