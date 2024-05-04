//Pow(x, n) with an optimized approach
class Solution {
    public double myPow(double x, int n) {
        double ans=1.0;
        long nn=n;//to avoid the overflow we take it as long
        if(nn < 0) //for negative element
        {
            nn=-1*nn;
        }
        //if nn is a +ve no
        while(nn > 0)
        {
            if(nn %2 == 1) //if it is a odd no
            {
              ans=ans*x;
              nn=nn-1;
            }else
            {
                //if it is a even no
                x=x*x;
                nn=nn/2;
            }
        }
        if(n <0)
        {
            ans=(double)(1.0)/(double)(ans);

        }
        return ans;
    }
}