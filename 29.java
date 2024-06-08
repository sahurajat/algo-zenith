import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
    // BruteForce Approach :-
    public static List<List<Integer>> threeSum_BruteForce(int[] arr){
        Set<List<Integer>> set = new HashSet<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                        temp.sort(null); 
                        set.add(temp);
                    }
                }
            }
        }
        List<List<Integer>> ans=new ArrayList<>(set);
        return ans;
    }

    // Better Approach :-
    public static List<List<Integer>> threeSum_better(int[] arr){
        Set<List<Integer>> ansSet=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            Set<Integer> set = new HashSet<>();
            for(int j=i+1;j<arr.length;j++){
                int third = -(arr[i]+arr[j]);
                if(set.contains(third)){
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
                    temp.sort(null);
                    ansSet.add(temp);
                }
                set.add(arr[j]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>(ansSet);
        return ans;
    }
    public static List<List<Integer>> threeSum(int[] arr){
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=0;i<n;i++){
            
            if (i != 0 && arr[i] == arr[i - 1]) continue;  //remove duplicates:

            int j=i+1; int k=n-1;
            while (j<k) {
                int sum=arr[i]+arr[j]+arr[k];
                if(sum < 0){
                    j++;
                }
                else if(sum > 0 ){
                    k--;
                }
                else{
                    List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k]);
                    ans.add(temp);
                    j++; k--;

                    //skip the duplicates:
                    while (j < k && arr[j] == arr[j - 1]) j++;
                    while (j < k && arr[k] == arr[k + 1]) k--;
                }

            }

        }
        return ans;
    }


    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4};
        List<List<Integer>> ans = threeSum_better(arr);
        System.out.println(ans);
    }
}
