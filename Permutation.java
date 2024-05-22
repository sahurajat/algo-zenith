import java.util.ArrayList;
import java.util.List;

public class Permutation {
    static void permutation(int[] nums, List<Integer> ds, List<List<Integer>> ans, boolean[] freq){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                freq[i]=true;
                ds.add(nums[i]);
                permutation(nums, ds, ans, freq);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        boolean freq[] =new boolean[nums.length];
        permutation(nums, ds, ans, freq);
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Permutation perm = new Permutation();
        List<List<Integer>> permutations = perm.permute(nums);
        for(List<Integer> p : permutations) {
            System.out.println(p);
        }
        
        // if you did not use static in permute method
        // for(List<Integer> p : permute(nums)) {
        //     System.out.println(p);
        // }
    }
}
