class Solution {
    public boolean isPalindrome(int x) {
        String str=x+"";
        return palindrome(str);
        
    }
    boolean palindrome(String str){
        int start=0;
        int end=str.length()-1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}