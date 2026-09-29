class Solution {
    public void duplicateZeros(int[] arr) {
        int n=arr.length;
        int[] res= new int[n];
        int j=0;
        for(int i=0;i<n && j<n;i++){
            if(arr[i]==0){
                res[j]=0;
                j++;
                if(j<n){
                    res[j]=0;
                    j++;
                }

            }
            else{
                res[j]=arr[i];
                j++;
            }
        }
        for(int k=0;k<n;k++){
            arr[k]=res[k];
        }
    }
}