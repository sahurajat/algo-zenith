public class Issorted {
    static boolean isSorted(int[]arr){
        for(int i=0;i<arr.length;i++){
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i])
                  return false;
            }
        }
        return true;
    }
    static boolean sorted(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};
        System.out.println(isSorted(arr));
        System.out.println(sorted(arr));
    }
}
