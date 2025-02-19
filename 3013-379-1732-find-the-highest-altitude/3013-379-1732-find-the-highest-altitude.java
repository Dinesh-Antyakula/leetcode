class Solution {
    public int largestAltitude(int[] gain) {
        int[] altitudes=new int[gain.length+1];
        int max=-999;
        altitudes[0]=0;
        for(int i=0;i<gain.length;i++){
            altitudes[i+1]=altitudes[i]+gain[i];
            if(altitudes[i]>max){
                max=altitudes[i];
            }
            
        }
        if(altitudes[altitudes.length-1]>max){
            max=altitudes[gain.length];
        }
        return max;
        
    }
}