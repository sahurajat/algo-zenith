public class Pow {
    public static double pow_bruteForce(double x, int n){
        double result=1.0;
        long nn= n;
        if(nn<0) nn= nn*-1;
        for(int i=0;i<nn;i++){
            result*=x;
        }
        if(n<0) result=1/result;
        return result;
    }
    static double myPow(double x, int n){
        double ans=1.0;
        long nn= n;
        if(nn<0) nn= -1*nn;
        while(nn>0){
            if(nn%2==1){
                ans=ans*x;
                nn=nn-1;
            }else {
                x=x*x;
                nn=nn/2;
            }
        }
        if(n<0) ans = (double)(1.0) / (double)(ans);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2.00000, -2));
    }
}
