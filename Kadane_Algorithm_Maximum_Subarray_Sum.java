public class Kadane_Algorithm_Maximum_Subarray_Sum {
    static int max_sum(int[] arr){
        int st=0;
        int end=0;
        int maxi=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(sum==0)  st=i;
            sum+=arr[i];
            if(sum>maxi){
                maxi=sum;
                end= i;
            }
            if(sum<0) sum=0;
        }
        System.out.print("The subarray is: [");
        for (int i = st; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
        return maxi;
    }
    public static void main(String[] args) {
        int arr[]={ -2,-3,4,-1,-2,1,5,-3};
        System.out.println(max_sum(arr));
    }
}
