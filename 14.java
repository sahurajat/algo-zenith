public class Sort_an_array_0s_1s_2s {
    static int[] sort(int[] arr){
        int count_0=0,count_1=0,count_2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
                count_0++;
            else if(arr[i]==1)
                count_1++;
            else
                count_2++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (count_0 > 0) {
                arr[i] = 0;
                count_0--;
            } else if (count_1 > 0) {
                arr[i] = 1;
                count_1--;
            } else {
                arr[i] = 2;
                count_2--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] ={0, 2, 1, 2, 0, 1};
        sort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
