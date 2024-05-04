#include<iostream>
#include<vector>
using namespace std;

vector<int>buildArray(vector<int>&nums)
	{	
		vector<int>ans;
		const int n = nums.size();
		for(int i=0;i<n;i++)
		{	
			ans.push_back(nums[nums[i]]);
		}
		return ans;
	}

int main()
{	
	vector<int>nums{0,2,1,5,3,4};
	buildArray(nums);
	int n = nums.size();
	for(int i=0;i<n;i++)
	{	
		cout << nums[i] << " ";
	}
	return 0;
}
