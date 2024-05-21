
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class largestSubsequence {

    //better approach
    //tc->O(NlogN)  Sc->O(1)
    public static int longestSuccessiveElements(int []a) {
        int n = a.length;
        if (n == 0) return 0;

        //sort the array:
        Arrays.sort(a);
        int lastSmaller = Integer.MIN_VALUE;
        int cnt = 0;
        int longest = 1;

        //find longest sequence:
        for (int i = 0; i < n; i++) {
            if (a[i] - 1 == lastSmaller) {
                //a[i] is the next element of the
                //current sequence.
                cnt += 1;
                lastSmaller = a[i];
            } else if (a[i] != lastSmaller) {
                cnt = 1;
                lastSmaller = a[i];
            }
            longest = Math.max(longest, cnt);
        }
        return longest;
    }

    //optimizzed approach

    //tc->O(n)  sc->O(n)
    public static int longetOptimizedApproach(int []a){
        int n=a.length;
        if(n==0)
        {
            return 0;
        }
        int longest=1;
        Set<Integer> set=new HashSet<>();


        //put all the element in to the araay
        for(int i=0;i<n;i++)
        {
            set.add(a[i]);
        }

        //find the longets sequence
        for(int it : set)
        {
            //if st is a starting  no or not
            if(!set.contains(it - 1)){
                //find the consequtive no
                int cnt = 1;
                int x = it;

                while(set.contains(x+1)){
                    x=x+1;
                    cnt=cnt+1;
                }
                longest=Math.max(longest, cnt);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] a = {100, 200, 1, 2, 3, 4};
        int ans = longetOptimizedApproach(a);
        System.out.println("The longest consecutive sequence is " + ans);
    }
}