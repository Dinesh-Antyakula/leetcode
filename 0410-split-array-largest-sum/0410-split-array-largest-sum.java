class Solution {
    public int splitArray(int[] nums, int k) {
        int start=0;
        int end=0;
        for(int i=0;i<nums.length;i++){
            start=Math.max(start,nums[i]);
            end+=nums[i];
        }
        // start contains max value in the array
        //end contains sum of all values in the array
        //binary search
        while(start<end){
            int mid=start+(end-start)/2;
            //calculate how many pieces u can make with this max sum


            int sum=0;
            int pieces=1;
            for(int num:nums){
                if(sum+num>mid){
                    //you cannot add this in this subarray. so new  subarray sum starts from current number na hence we did sum=num
                    sum=num;
                    pieces++;

                }
                else{
                    sum+=num;
                }
            }
            if(pieces>k){
                start=mid+1;
            }
            else{
                end=mid;
            }

        }
        return end;//in this case start ,end and mid all are same hence we can return anything

    }
}