#include<iostream>
#include<vector>
using namespace std;
vector<int> getconcatenation(vector<int>&nums)

{ 	
	const int n = nums.size();
	// Inserting the Elements one more time.
	for(int i=0 ;i <n ; i++)
	{	
		nums.push_back(nums[i]);

	}

	return nums;
}
int main()
{	
	vector<int> arr{1,3,2,1};
	getconcatenation(arr);
	const int n = arr.size();
	for(int i=0;i<n;i++)
	{	
		cout << arr[i] << " ";
	}
	cout << endl;
	return 0;
}
