Given an integer array nums that may contain duplicates, return all possible subsets(the power set).
The solution set must not contain duplicate subsets. Return the solution in any order.


class Solution {
    public void findSubsets(int[] nums,int ind, List<Integer> ds , List<List<Integer>> ans) {
        ans.add(new ArrayList<>(ds));
        for(int i=ind;i<nums.length;i++){
            if(i!=ind && nums[i]==nums[i-1]) continue;
            ds.add(nums[i]);
            findSubsets(nums,i+1,ds,ans);
            ds.remove(ds.size()-1);
        }
    }


    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        findSubsets(nums,0,new ArrayList<>(), ans);
        return ans;
    }
}
