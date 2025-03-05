class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ans= new ArrayList<>();
        int a=getMax(candies);
        int count=0;
        for(int num:candies){
            // if (num+extraCandies>=a){
            //     ans.add(true);
            // }
            // else{
            //     ans.add(false);
            // }
            ans.add(num+extraCandies>=a);
        }
        return ans;

    }
    static int getMax(int[] nums){
        int max=-999;
        for(int a:nums){
            if(a>max){
                max=a;
            }
        }
        return max;
    }
    
}