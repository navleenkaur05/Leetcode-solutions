class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
    GenerateCombinations(1,n,k);
    return res;
    }
    private void GenerateCombinations(int st, int n, int k){
        if(temp.size() == k){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i = st ; i<=n ;i++){
            temp.add(i);
            GenerateCombinations(i+1,n,k);
            temp.remove(temp.size()-1);
        }
    }
}