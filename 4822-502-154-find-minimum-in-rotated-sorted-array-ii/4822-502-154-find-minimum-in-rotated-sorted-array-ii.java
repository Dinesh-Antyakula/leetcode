class Solution {
    public int findMin(int[] nums) {
        int pivot=findpivotwithduplicates(nums);
        // if(nums.length==0){
        //     return 1;
        // }
        // if(nums.length==1){
        //     return nums[0];
        // }
        if(pivot==-1){
            return nums[0];
        }
        else{
            return nums[pivot+1];
        }
        
    }
    public int findpivotwithduplicates(int[]arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]==arr[start]&&arr[mid]==arr[end]){
                //skip duplicates
                //note:what if these elements at start and end are pivots
                //check if start is pivot
                if(start<end && arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                //check if end is pivot or not
                if(end>start&& arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            //leftside is sorted so pivot should be in right side
            else if(arr[start]<arr[mid]||(arr[start]==arr[mid]&&arr[mid]>arr[end])){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return -1;
    }
}