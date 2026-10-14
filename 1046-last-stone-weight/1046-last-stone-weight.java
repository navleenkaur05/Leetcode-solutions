class Solution {
    public int lastStoneWeight(int[] stones) {
        int  n = stones.length;
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        for(int i : stones ){
            pq.add(i);
        }
        int diff=0;
        while(pq.size()>1){
            int a = pq.remove();
            int b = pq.remove();
            diff=a-b;
            if(diff!=0) pq.add(diff);
        }
        if(pq.isEmpty()) return 0;
        return pq.peek();
    }
}