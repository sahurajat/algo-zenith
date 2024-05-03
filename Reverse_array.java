public class Reverse_array {
    public static void main(String[] args) {
        int arr[] = {3,4,5,6,7};
        rev(arr);
        System.out.println();
        rev_using_swap(arr);
        System.out.println();
        int arr1[] = {1,2,3,4,5};
        rev_using_recursive(arr1,0,arr1.length-1);
        printArray(arr1);
    }

    static void rev(int arr[]){
        // reverse array using extra array
        int length=arr.length;
        int[] rev_array = new int[length];
        for (int i=length-1;i>=0;i--){
            rev_array[length-i-1]=arr[i];
        }
        printArray(rev_array);
    }

    static void rev_using_swap(int arr[]){
        // reverse using swapping of two pointer
        int length=arr.length;
        int p1=0;
        int p2=length-1;
        while(p1<p2){
            int temp=arr[p1];
            arr[p1]=arr[p2];
            arr[p2]=temp;
            p1++;
            p2--;
        }
        printArray(arr);
    }

    static void rev_using_recursive(int arr[],int st,int end){
        // reverse array using recursion
        if(st<end){
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            rev_using_recursive(arr, st+1, end-1);
        }
    }

    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
