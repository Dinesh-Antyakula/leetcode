class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans=new int[nums.length];
        int i=0;
       for(int num:nums){
           ans[i++]=findSmaller(nums,num);

       }
       return ans;


    }
    public  int findSmaller(int [] nums,int j){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<j){
                count++;
            }
        }
        return count;
    }
}