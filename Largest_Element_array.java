// Find the Largest element in an array

import java.util.Arrays;

public class Largest_Element_array {
    static int largest_eleemnt(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    static int large_ele_array(int arr[]){
        int max=0;
        for (int i=1;i<arr.length;i++){
            max=arr[0];
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;  
    }
    public static void main(String[] args) {
        int arr[]={2,3,1,70,5,4,10,5};
        System.err.println(largest_eleemnt(arr));
        System.out.println(large_ele_array(arr));

    }
}
