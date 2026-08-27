class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] arr=new int[1001];
        for(int[] trip : trips){
            int passenger=trip[0];
            int from=trip[1];
            int to=trip[2];

            arr[from]+=passenger;
            arr[to]-=passenger;
        }
        int sum=0;
        for(int i=0;i<=1000;i++){
            sum+=arr[i];
            if(sum>capacity) return false;
        }
        return true;
    }
}