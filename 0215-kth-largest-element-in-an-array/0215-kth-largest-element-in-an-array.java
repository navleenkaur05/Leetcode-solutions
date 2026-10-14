class Solution {
    public int findKthLargest(int[] nums, int k) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        // for(int i  : nums ){
        //     pq.add(i);
        // }
        // while(--k > 0) pq.poll();
        // return pq.peek();

         PriorityQueue<Integer> pq = new PriorityQueue<>();
         for(int i : nums ){
            pq.offer(i);
            if(pq.size() > k ) pq.poll();
         }
         return pq.peek();
    }
}