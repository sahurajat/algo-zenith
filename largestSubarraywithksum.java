import java.util.HashMap;

public class largestSubarraywithksum {
    //brute force approach
static int solve(int[] a){
	int  max = 0;
	for(int i = 0; i < a.length; ++i){
		int sum = 0;
		for(int j = i; j < a.length; ++j){
			sum += a[j];
			if(sum == 0){
				max = Math.max(max, j-i+1);
			}
		}
	}
	return max;
   }


   //optimal approach(it will work both popositive and negative no)
    //TC->)O(N)  Sc->O(N)
   static int maxLength(int []a){
    int n=a.length;
    HashMap<Integer,Integer> mpp=new HashMap<>();
    int maxLen=0;
    int sum=0;
    for(int i=0;i<n;i++)
    {
        sum += a[i];
        if(sum == 0)
        {
            maxLen=i+1;
        }
        else {
            if(mpp.get(sum) != null) {

                maxLen = Math.max(maxLen, i - mpp.get(sum));
            }
            else {

                mpp.put(sum, i);
            }
        }

    }
    return maxLen;
   }
    public static void main(String args[])
    {
        int a[] = {9, -3, 3, -1, 6, -5};
        System.out.println(maxLength(a));
    }
}

