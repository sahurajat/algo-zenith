import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class threeSum {
    //brute force approach
    // public static List<List<Integer>> triplet(int n, int[] arr) {
    //     Set<List<Integer>> st=new HashSet<>();

    //     //nnow i have to check for all triplets
    //     for(int i=0;i<n;i++)
    //     {
    //         for(int j=i+1;j<n;j++)
    //         {
    //             for(int k=j+1;k<n;k++)
    //             {
    //                if(arr[i]+arr[j]+arr[k]==0)
    //                {
    //                 List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
    //                 temp.sort(null);
    //                 st.add(temp);
    //                }
    //             }
    //         }

    //     }
    //     List<List<Integer>> anList=new ArrayList<>(st);
    //     return anList;


    //better approach

//TC - O(N^2)   sc->O(N)
    // public static List<List<Integer>> triplet(int n, int[] arr) {
    //     Set<List<Integer>>   st=new HashSet<>();
    //     for(int i=0;i<n;i++){
    //     Set<Integer> hashSet=new HashSet<>();
    //     for(int j=i+1;j<n;j++)
    //     {

    //         //now  we have to calcuulate the third elemment
    //         int third=-(arr[i]+arr[j]);


    //         //now we have to find the thirde element is in the hahset or not
    //         if(hashSet.contains(third)){
    //             List<Integer> temp= Arrays.asList(arr[i],arr[j],third);
    //             temp.sort(null);
    //             st.add(temp);
    //         }
    //         hashSet.add(arr[j]);

    //     }
    // }
    //         // store the set elements in the answer:
    //         List<List<Integer>> ans = new ArrayList<>(st);
    //         return ans;

    // }

//optimal appproach
public static List<List<Integer>> triplet(int n, int[] arr) {
    List<List<Integer>>  ans=new ArrayList<>();
    Arrays.sort(arr);


    for(int i=0;i<n;i++)
    {
        if(i!=0 && arr[i] == arr[i-1]) continue;;

        //now we use of two poimters
        int j=i+1;
        int k=n-1;
        while(j<k)
        {
            int sum=arr[i]+arr[j]+arr[k];
            if(sum < 0)
            {
             j++;
            }
            else if(sum > 0)
            {
                k--;
            }
            else
            {
                List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    //skip the duplicates:
                    while (j < k && arr[j] == arr[j - 1]) j++;
                    while (j < k && arr[k] == arr[k + 1]) k--;

            }
        }
    }
    return ans;
}

    public static  void main(String[]args){
        int[] arr = { -1, 0, 1, 2, -1, -4};
        int n = arr.length;
        List<List<Integer>> ans = triplet(n, arr);
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }

}
