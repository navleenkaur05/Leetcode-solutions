class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        GenerateSubsets(0,nums);
        return res;
    }
    private void GenerateSubsets(int ind, int[] nums){
        res.add(new ArrayList<>(temp));
        for(int i = ind ; i < nums.length ; i++){
            temp.add(nums[i]);
            GenerateSubsets(i+1,nums);
            temp.remove(temp.size()-1);
        }
    }
}