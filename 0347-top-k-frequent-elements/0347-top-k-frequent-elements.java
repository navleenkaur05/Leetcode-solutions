class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int ele : nums){
            mp.put(ele,mp.getOrDefault(ele,0)+1);
        }
        PriorityQueue<int[]> mnh=new PriorityQueue<>(
            (a,b) -> a[0]-b[0]
        );
        for(Map.Entry<Integer,Integer> ent : mp.entrySet()){
            int element=ent.getKey();
            int freq=ent.getValue();
            mnh.add(new int[] {freq,element});
            if(mnh.size()>k) mnh.poll();
        }
        int ans[]=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=mnh.poll()[1];
        }
        return ans;
    }
}