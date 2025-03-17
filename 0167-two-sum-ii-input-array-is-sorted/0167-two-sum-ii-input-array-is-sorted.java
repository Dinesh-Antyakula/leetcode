class Solution {
    public int[] twoSum(int[] arr, int target) {
        int[] ans=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        for(int i=0;i<arr.length;i++){
            int a=arr[i];
            int nt=target-a;
            int ti=bsearch(arr,nt,i+1,arr.length-1);
            if(ti!=-1){
                ans[0]=i+1;
                ans[1]=ti+1;
                break;
            }
        }
        return ans;
        
    }
    public int bsearch(int[] arr,int k,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(k<arr[mid]){
                end=mid-1;
            }
            else if(k>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;


    }
}