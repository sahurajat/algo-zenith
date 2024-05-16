public class Sub_array_sum {
    static int max_sum(int[] arr){
        int max_sum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                max_sum=Math.max(max_sum, sum);
            }
        }
        return max_sum;
    }
    static int subarray_sum(int[] arr){
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                max_sum=Math.max(max_sum, sum);
            }
        }
        return max_sum;
    }
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("The maximum subarray sum is : "+max_sum(arr));
        System.out.println("The maximum subarray sum is : "+subarray_sum(arr));
    }
}
