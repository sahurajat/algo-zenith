import java.util.*;
public class Leaders_in_an_Array {
    static ArrayList<Integer> leaders_brute_force(int[] arr){
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    break;
                }
                if(j==arr.length-1){
                    ans.add(arr[i]);
                }
            }
        }
        ans.add(arr[arr.length-1]);
        return ans;
    }
    static ArrayList<Integer> leader_brute(int[] arr){
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            boolean leader= true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    leader=false;
                    break;
                }
            }
            if(leader){
                ans.add(arr[i]);
            }
        }
        ans.add(arr[arr.length-1]);
        return ans;
    }
    static ArrayList<Integer> leader_optimal(int[] arr){
        ArrayList<Integer> ans= new ArrayList<>();
        int n=arr.length;
        ans.add(arr[n-1]);
        int maxi=arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i]>maxi){
                ans.add(arr[i]);
                maxi=arr[i];
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int arr[]=  {10, 22, 12, 3, 0, 6};
        System.out.println(leader_optimal(arr));
    }
}
