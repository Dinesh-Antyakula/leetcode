class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int a:nums){
            if(even(a)){
                c++;
            }
        }
        return c;
    }
    boolean even(int num){
        int numberOfDigits=digits(num);
        return numberOfDigits%2==0;
    }
    int digits(int num){
        if(num<0){
            num*=-1;
        }
        //return (int)(Math.log10(num)+1);
        
        int count=0;
        if(num<0){
            num*=-1;
        }
        if(num==0){
            return 1;
        }
        while(num>0){
            count++;
            num/=10;
        }
        return count;
        
         
    }
}