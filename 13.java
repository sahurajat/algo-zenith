public class SortArrayUsingDutchNationalFlagAlgo {
    static void sortArray(int[] arr){
        int low=0,mid=0,high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else if(arr[mid]==2){
                int temp=arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp;
                high--;
            }
        }
        
    }
    public static void main(String[] args) {
        int arr[]={0, 2, 1, 2, 0, 1};
        sortArray(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
