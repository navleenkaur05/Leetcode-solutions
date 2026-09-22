class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        Stack<Integer> st=new Stack<>();
        int[] res=new int[n];
        st.push(0);
        for(int i=0;i<n;i++){
        while(!st.isEmpty() && temperatures[st.peek()]<temperatures[i]){
            int l=st.pop();
            res[l]=i-l;
        }
        st.push(i);
        }
        return res;
        
    }
}