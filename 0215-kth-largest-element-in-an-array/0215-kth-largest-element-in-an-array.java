class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i  : nums ){
            pq.add(i);
            // if(pq.size()>k) pq.remove();
        }
        while(--k > 0) pq.poll();
        return pq.peek();
    }
}