#include<iostream>
#include<vector>
using namespace std;

void FindCommonElement(int arr1[],int arr2[],int temp[],int m , int n , int& k)
{	
	int i=0 , j=0;
	while(i<m && j<n)
	{	
		if(arr1[i] == arr2[j])
		{
			temp[k] = arr1[i];
			i++ ; j++ ; k++;
		}
		else if( arr1[i] < arr2[j])
		{	
			i++;	
		}
		else
		{	
			j++; 
		}
	
	}	
}
int main()
{	
	int arr1[] ={1,5,10,20,40,80};
	int arr2[]={6,7,20,80,100};
	int arr3[]={3,4,15,20,30,70,80,120};
	int ans[100];
	int m = sizeof(arr1)/sizeof(int);
	int n = sizeof(arr2)/sizeof(int);
	int n3= sizeof(arr3)/sizeof(int);
	int t[100]; int k =0;
	FindCommonElement(arr1,arr2,t,m,n,k);
	int tempsize=k;
	k=0;

	FindCommonElement(arr3,t,ans,n3,tempsize,k);
	cout << "Common Elements in the 3 Sorted Array : ";
	for(int i=0;i<k;i++)
	{
		cout << ans[i] << " ";
	}
	cout << endl;
	return 0;
	

}
