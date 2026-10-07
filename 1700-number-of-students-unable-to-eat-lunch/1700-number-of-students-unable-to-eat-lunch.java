class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        for(int preference : students ){
            q.offer(preference);
        }
        int i =0;
        int count=0;
        while(!q.isEmpty()){
            if(q.peek()==sandwiches[i]){
                q.poll();
                i++;
                count=0;
            }
            else{
                count++;
                q.offer(q.poll());
            }
            if(count==q.size()) return q.size();
        }
        return 0;
    }
}