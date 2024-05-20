// Two Sum : Check if a pair with given sum exists in Array
// import java.util.Arrays;
public class Two_Sum {
    public static String two_sum(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println( i + ", " + j);
                    return "YES";
                }
            }
        }
        return "NO";
    }
    public static void main(String[] args) {
        int arr[]={2,6,5,8,11};
        System.out.println(two_sum(arr,14));
    }
}
