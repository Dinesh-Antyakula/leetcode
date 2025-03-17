class Solution {
    public int[] shuffle(int[] arr, int n) {
        int[]ans=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                ans[i]=arr[j];
                j++;
            }
            else{
                ans[i]=arr[n];
                n++;
            }
        }
        return ans;
    }
}