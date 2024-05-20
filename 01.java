// Binary Search using recursion
public class BinarySearch {
    static int binary_search(int arr[],int se,int si,int ei){
        if(si>ei){
            return -1;
        }
        int mid=(si+ei)/2;
        if(arr[mid]==se){
            return mid;
        }
        else if (arr[mid]>se){
            return binary_search(arr, se, si, mid-1);
        }
        else{
            return binary_search(arr, se, mid+1, ei);
        }

    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7};
        System.out.println(binary_search(arr,4,0,arr.length-1));
    }
}
