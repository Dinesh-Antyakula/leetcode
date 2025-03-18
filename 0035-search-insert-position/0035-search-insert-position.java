class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans=bsearch(nums,target,true);
        if(ans==-1){
            ans=bsearch(nums,target,false);
        }
        return ans;
    }
    public int bsearch(int[] arr, int target,boolean flag){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            } else if (arr[mid]<target) {
                start=mid+1;

            }
            else{
                return mid;
            }
        }
        if(flag==true){
            return -1;
        }
        else{
            return end+1;
        }
    }
}