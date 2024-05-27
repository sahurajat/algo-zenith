import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Longest_consecutive_seq {
    // static int consecutive_bruteForce_1(int[] arr){
    //     Arrays.sort(arr);
    //     int maxi=Integer.MIN_VALUE;
    //     for(int i=0;i<arr.length;i++){
    //         int cnt=0;
    //         for(int j=0;j<arr.length;j++){
    //             if(arr[i]==arr[j]){
    //                 cnt++;
    //                 arr[i]++;
    //             }
    //         }
    //         if(cnt>maxi){
    //             maxi=cnt;
    //         }
    //     }
    //     return maxi;
    // }

    static int consecutive_bruteForce(int[] arr){
        int longest=1;
        for(int i=0;i<arr.length;i++){
            int x=arr[i];
            int cnt=1;

            while(ls(arr,x+1)){
                x++;
                cnt++;
            }
            longest= Math.max(longest, cnt);
        }
        return longest;
    }
    static boolean ls(int[] arr,int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return true;
            }
        }
        return false;
    }

    // static int consecutive(int[] arr){
    //     Arrays.sort(arr);
    //     int longest=Integer.MIN_VALUE;
    //     int cnt=1;
    //     for(int i=0;i<arr.length-1;i++){
    //         if(arr[i]+1==arr[i+1]){
    //             cnt++;
    //         }
    //         longest=Math.max(cnt, longest);
    //     }
    //     return longest;
    // }
    static int consecutive(int[] arr){
        if (arr.length == 0) return 0;
        Arrays.sort(arr);
        int last_smallest=Integer.MIN_VALUE;
        int cnt=0;
        int longest=1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]-1==last_smallest){
                cnt+=1;
                last_smallest=arr[i];
            }
            else if(arr[i]!=last_smallest){
                last_smallest=arr[i];
                cnt=1;
            }
            longest=Math.max(longest, cnt);
        }
        return longest;
    }

    static int consecutive_optimal(int[] arr){
        if (arr.length == 0) return 0;
        int longest=1;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }

        for(int it: set){
            if(!set.contains(it-1)){
                int cnt=1;
                int x=it;
                while(set.contains(x+1)){
                    x+=1;
                    cnt+=1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
    

    public static void main(String[] args) {
        int arr[]={100, 200, 1, 2, 3, 4};
        System.out.println(consecutive_optimal(arr));
    }
}
