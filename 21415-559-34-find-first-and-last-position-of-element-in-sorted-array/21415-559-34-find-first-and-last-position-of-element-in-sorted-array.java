class Solution {
    static int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        ans[0]=first_and_last(nums,target,true);
        if(ans[0]!=-1){
            ans[1]=first_and_last(nums,target,false);
        }
        return ans;


    }
    static int first_and_last(int[]nums,int target,boolean isFirstOCC){
        int ans=-1;
        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                ans=mid;
                if(isFirstOCC==true){
                    end=mid-1;

                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}