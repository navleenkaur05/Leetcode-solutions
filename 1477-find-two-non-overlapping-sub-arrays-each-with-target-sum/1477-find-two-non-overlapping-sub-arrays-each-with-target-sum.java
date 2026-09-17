class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n=arr.length;
        int inf=Integer.MAX_VALUE/2;
        int[] best=new int[n];
        Arrays.fill(best,inf);
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int prefix=0;
        int minlen=inf;
        int ans=inf;
        for(int i=0;i<n;i++){
            prefix+=arr[i];
            if(map.containsKey(prefix-target)){
                int  start = map.get(prefix-target);
                int len=i-start;
                if(start>=0 && best[start]!=inf){
                    ans=Math.min(ans,len+best[start]);
                    
                }
                minlen=Math.min(minlen,len);
            }
            best[i]=minlen;
            map.put(prefix,i);
        }
        return ans==inf?-1:ans;
    }
}